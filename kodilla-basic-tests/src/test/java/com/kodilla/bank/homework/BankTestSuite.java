package com.kodilla.bank.homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank = new Bank();

    CashMachine atm = new CashMachine();
    CashMachine cashDispenser = new CashMachine();
    CashMachine cashDepositMachine = new CashMachine();

    @BeforeEach   //Czy dobrze użyte?
    public void transaction(){
        atm.add(1000);
        atm.add(-900);
        atm.add(111);

        cashDispenser.add(100);
        cashDispenser.add(-111);
        cashDispenser.add(350);

        cashDepositMachine.add(200);
        cashDepositMachine.add(-350);
        cashDepositMachine.add(200);

        bank.add(atm);          // coś nie tak :/
        bank.add(cashDispenser);    // coś nie tak :/
        bank.add(cashDepositMachine);   // coś nie tak :/
    }


    @Test
    public void shouldHave600Saldo(){

        assertEquals(600, bank.bilans());
    }

    @Test
    public void shoudHaveQuantityOfCashWithdrawal(){
        assertEquals(3, bank.cashWithdrawal());
    }

    @Test
    public void shouldHaveQuantityOfCashDeposit(){
        assertEquals(6, bank.cashDeposit());
    }

    @Test
    public void shouldHaveAverageCashWithdrawal(){
        assertEquals(453.66,bank.averageMinus(), 0.0001);
    }

    @Test
    public void shouldHaveAverageCashDeposit(){
        assertEquals(326.83,bank.averagePlus(), 0.0001);
    }

    @Test
    public void shouldBeZeroSaldoIfBankDontHaveCashmachine(){
        assertEquals(0, bank.bilans());
    }

    @Test
    public void shouldHaveZeroAverageIfBankDontHaveCashmachine(){
        assertEquals(0, bank.average());
    }




}
