package com.keyin;

public class ToDoListManager {
    private static User[] users = new User[10];
    private static int userCount = 0;

    public static void main(String[] args) {
        addUser("Chelsey");
        addUser("Marcus");
        addUser("Chelsey"); // try duplicate

        addTaskForUser("Chelsey", "Cook supper");
        addTaskForUser("Chelsey", "Do DSA midterm");
        addTaskForUser("Chelsey", "Clean house");
        addTaskForUser("Chelsey", "Pick up mail");


        addTaskForUser("Marcus", "Go to the gym");
        addTaskForUser("Marcus", "grade papers");
        addTaskForUser("Marcus", "Buy flowers");

        markTaskAsDone("Chelsey", "Do DSA midterm");

        deleteTaskForUser("Chelsey", "Clean house");

        for (int i = 0; i < userCount; i++) {
            users[i].displayTasks();
            System.out.println();
        }
    }

        // add method
    public static void addUser(String name) {
        if (isUserNameUnique(name)) {
            if (userCount < users.length) {
                users[userCount] = new User(name);
                userCount++;
                System.out.println("User " + name + " added.");
            } else {
                System.out.println("Cannot add more users, array full.");
            }
        } else {
            System.out.println("User with the name " + name + " already exists. Please choose a different name.");
        }
    }

        // check is name is unique
    public static boolean isUserNameUnique(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].name.equals(name)) {
                return false;
            }
        }
        return true;
    }

        // method to add task to user instead of index num
    public static void addTaskForUser(String userName, String taskDescription) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].name.equals(userName)) {
                users[i].addTask(taskDescription);
                System.out.println("Task added for " + userName + ": " + taskDescription);
                return;
            }
        }
        System.out.println("User " + userName + " not found.");
    }

    //delete method for getting rid of tasks
    public static void deleteTaskForUser(String userName, String taskDescription) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].name.equals(userName)) {
                users[i].deleteTask(taskDescription);
                return;
            }
        }
        System.out.println("User " + userName + " not found.");
    }


    public static void markTaskAsDone(String userName, String taskDescription) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].name.equals(userName)) {
                users[i].markTaskAsDone(taskDescription);
                return;
            }
        }
        System.out.println("User " + userName + " not found.");
    }
}

