package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public List<Order> getOrderList(){
        return orders;
    }

    public void addOrder (Order order){
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException{
        Order orderNumber = orders.stream()
                .filter(order1 -> order1.getNumber().equals(number))
                .findAny().orElseThrow(()-> new OrderDoesntExistException());
            return orderNumber;
    }
}
