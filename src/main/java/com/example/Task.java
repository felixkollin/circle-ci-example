package com.example;

public class Task {
    private String name;
    private String description;
    private boolean completed;

    public Task(String name, String description){
        this.name = name;
        this.description = description;
        completed = false;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void complete(){
        if(!completed){
            completed = true;
            System.out.println("[Completed task] " + name + ": " + description);
        }
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean isCompleted(){
        return this.completed;
    }
}
