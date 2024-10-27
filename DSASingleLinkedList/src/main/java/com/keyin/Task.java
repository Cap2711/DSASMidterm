package com.keyin;

class Task {
    String description;
    boolean isDone;
    Task next;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
        this.next = null;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public String toString() {
        return description + " - " + (isDone ? "Completed" : "Not completed");
    }
}
