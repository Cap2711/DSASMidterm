package com.keyin;

class TaskList {
    private Task head;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    public void deleteTask(String description) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        if (head.description.equals(description)) {
            head = head.next;
            System.out.println("Task deleted: " + description);
            return;
        }
        Task current = head;
        while (current.next != null && !current.next.description.equals(description)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task deleted: " + description);
        } else {
            System.out.println("Task not found: " + description);
        }
    }

    public void markTaskAsDone(String description) {
        Task current = head;
        while (current != null) {
            if (current.description.equals(description)) {
                current.markAsDone();
                break;
            }
            current = current.next;
        }
    }



    public void displayTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
