package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("000001"));
        warehouse.addOrder(new Order("000002"));
        warehouse.addOrder(new Order("000003"));
        warehouse.addOrder(new Order("000004"));
        warehouse.addOrder(new Order("000005"));
        warehouse.addOrder(new Order("000006"));

        try {
            warehouse.getOrder("1");
            System.out.println("Mamy Twoje zamówienie");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sprawdź numer zamówienia");
        } finally {
            System.out.println("Dziękujemy za kontakt");
        }
    }
}
