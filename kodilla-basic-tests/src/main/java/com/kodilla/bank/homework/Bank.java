package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank(){
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachine, 0, newTab, 0, cashMachines.length);
        newTab[this.size -1 ] = cashMachine;
        this.cashMachines = newTab;
    }

    public int bilans(){
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += cashMachines[i].saldo();
        }
        return sum;
    }

    public int cashWithdrawal() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            cash += cashMachines[i].cashWithdrawal();
        }
        return cash;
    }

        public int cashDeposit(){
            int cash = 0;
            for (int i = 0; i < size; i++){
                cash += cashMachines[i].cashDeposit();
            }
            return cash;
    }

    public double average(){
        double sum = bilans();
        int quantity = 0;
        for (int i = 0; i < size; i++){
            quantity += cashMachines[i].quantinty();
        }
        return sum / quantity;
    }

    public double averageMinus(){
        double sum = bilans();
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            sum += cashMachines[i].saldoMinus();
            quantity += cashMachines[i].cashWithdrawal();
        }
        return sum / quantity;
    }

    public double averagePlus(){
        double sum = bilans();
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            sum += cashMachines[i].saldoPlus();
            quantity += cashMachines[i].cashDeposit();
        }
        return sum / quantity;
    }

}
