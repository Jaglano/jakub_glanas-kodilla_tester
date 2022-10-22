package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        this.orders.add(order);
    }

    public List<Order> getOrdersFromDateRange(LocalDate date1, LocalDate date2){
        return orders
                .stream()
                .filter(day1 -> day1.getDate().isAfter(date1))
                .filter(day2->day2.getDate().isBefore(date2))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersFromPriceRange(double minValue, double maxValue){
        return orders
                .stream()
                .filter(min->min.getValue() >= minValue)
                .filter(max->max.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getOrdersQuantity(){
        return this.orders.size();
    }

    public double getOrdersAmount(){
        return orders
                .stream()
                .mapToDouble(Order::getValue)
                .sum();
    }

    public int getSize() {
        return this.orders.size();
    }
}
