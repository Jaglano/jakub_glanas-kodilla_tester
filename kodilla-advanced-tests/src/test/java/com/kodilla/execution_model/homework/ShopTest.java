package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();

    @BeforeAll
            public static void showIntroMessaghe(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    public void collectOrders(){
        shop.addOrder(new Order(10.0d, LocalDate.of(2022, 10,1),"Okon123"));
        shop.addOrder(new Order(12.0d, LocalDate.of(2022, 10,3),"Kowal55"));
        shop.addOrder(new Order(14.0d, LocalDate.of(2022, 10,5),"tester1"));
        shop.addOrder(new Order(16.0d, LocalDate.of(2022, 10,7),"robson12"));
        shop.addOrder(new Order(18.0d, LocalDate.of(2022, 10,9),"dzik999"));
        shop.addOrder(new Order(20.0d, LocalDate.of(2022, 10,11),"eeeeeeee"));
    }

    @Test
    void shouldAddOrderToInvoice(){
        int invoiceOrders = shop.getSize();
        assertEquals(6, invoiceOrders);

    }

    @Test
    void shouldReturnOrdersQuantity(){
        int orderNumb = shop.getOrdersQuantity();
        assertEquals(6, orderNumb);
    }

    @Test
    void shouldReturnOrdersFromMinMaxValue(){
        assertEquals(3, shop.getOrdersFromPriceRange(10.0,14.0).size());
    }

    @Test
    void shouldReturnOrdersFromDataRange(){
        assertEquals(3, shop.getOrdersFromDateRange(LocalDate.of(2022,10,5),LocalDate.of(2022,10,12)).size());
    }

    @Test
    void shouldReturnAmountOfOrders(){
        double ordersValue = shop.getOrdersAmount();
        assertEquals(90.0d,ordersValue);

    }

}