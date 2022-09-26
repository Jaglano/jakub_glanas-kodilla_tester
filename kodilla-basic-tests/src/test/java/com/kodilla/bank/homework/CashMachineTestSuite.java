package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLenght(){
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(3000);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(200, values[0]);
        assertEquals(3000, values[1]);
    }

    @Test
    public void shouldCalculateSaldo(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1000);
        cashMachine.add(3000);
        cashMachine.add(-150);

        assertEquals(3850, cashMachine.saldo());
    }

    @Test
    public void shouldCalcutateTransactionQuantity(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(-10);

        assertEquals(2, cashMachine.quantinty());
    }

    @Test
    public void shouldCalculateQuantityCashDeposit(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(100);

        assertEquals(2, cashMachine.cashDeposit());
    }
}
