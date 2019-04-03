package com.example;

public class Launcher {

    public static void main(String[] args) {
        TodoList list = new TodoList("Example List");
        list.createTask("123", "Important", "Do important things.");
        list.createTask("1234", "Some other", "This is some other thing.");

        // Complete the tasks
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list.completeAll();
    }
}
