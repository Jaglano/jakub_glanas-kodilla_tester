package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;


public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200,wallet.getBalance());
        });
        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30,cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance",170,wallet.getBalance());
        });


        Given("I have deposited $1000 in my wallet", () -> {
            wallet.deposit(1000);
            Assert.assertEquals("Incorrect wallet balance",1000,wallet.getBalance());
        });
        When("I request $0", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,0);
        });
        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0,cashSlot.getContents());
        });
        Then("the balance of my wallet should be $1000", () -> {
            Assert.assertEquals("Incorrect wallet balance",1000,wallet.getBalance());
        });


        Given("I have deposited $5000 in my wallet", () -> {
            wallet.deposit(5000);
            Assert.assertEquals("Incorrect wallet balance",5000,wallet.getBalance());
        });
        When("I request $5000", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,5000);
        });
        Then("$5000 should be dispensed", () -> {
            Assert.assertEquals(5000,cashSlot.getContents());
        });
        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance",0,wallet.getBalance());
        });



    }
}