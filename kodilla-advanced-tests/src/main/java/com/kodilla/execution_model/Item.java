package com.kodilla.execution_model;

public class Item {
    private String name;
    private double price;

    public Item(String item, double price) {
        this.name = item;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
