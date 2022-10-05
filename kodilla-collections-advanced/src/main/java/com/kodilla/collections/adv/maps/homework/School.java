package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Double> classes = new ArrayList<>();

    public School(List<Double> classes){
        this.classes = classes;
    }


    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                '}';
    }

    public double getSum(){
        double sum = 0.00;
        for (double school:classes) {
        sum += school;
        } return sum;
    }
}
