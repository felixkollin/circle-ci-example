package com.example;

import java.util.HashMap;

public class TodoList {
    private HashMap<String, Task> tasks;
    private String title;

    public TodoList(String title){
        this.tasks = new HashMap<>();
    }

    public void createTask(String uuid, String name, String description){
        this.tasks.put(uuid, new Task(name, description));
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void completeAll(){
        for(Task task : tasks.values()){
            task.complete();
        }
    }

    public void completeTask(String uuid) {
        Task task = tasks.get(uuid);
        if(task != null){
            task.complete();
        }
    }
}
