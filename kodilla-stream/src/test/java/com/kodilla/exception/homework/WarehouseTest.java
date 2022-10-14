package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void testGetOrder() throws OrderDoesntExistException{
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("111"));
        warehouse.addOrder(new Order("222"));
        warehouse.addOrder(new Order("333"));
        warehouse.addOrder(new Order("444"));
        warehouse.addOrder(new Order("555"));
    Order expected = new Order("111");
    assertNotNull(expected);
    }

    @Test
    public void testGetMissingOrder(){
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class,() ->warehouse.getOrder("1"));
    }
}