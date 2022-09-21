package com.kodilla.abstracts.homework;

public class Teacher extends Job{
    public Teacher(){
        super(5000, "teaching children");
    }

    @Override
    public void Responobility() {
        System.out.println(getResponsibilities());
    }
}