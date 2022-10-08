package com.kodilla.collections.adv.immutable.homework;

public class Task {

    protected String title;
    protected String duration;

    public Task(String title, String duration){
        this.title = title;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }
}
