package com.kodilla.abstracts.homework;

public class Accountant extends Job{
    public Accountant(){
        super(6500, "issuing invoices");

    }

    @Override
    public void Responobility() {
        System.out.println(getResponsibilities());
    }
}