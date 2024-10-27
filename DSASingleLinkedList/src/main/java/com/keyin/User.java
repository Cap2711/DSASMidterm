package com.keyin;

class User {
    String name;
    TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public void addTask(String description) {
        taskList.addTask(description);
    }

    public void markTaskAsDone(String description) {
        taskList.markTaskAsDone(description);
    }

    public void deleteTask(String description) {
        taskList.deleteTask(description);
    }

    public void displayTasks() {
        System.out.println(name + "'s To-Do List:");
        taskList.displayTasks();
    }
}
