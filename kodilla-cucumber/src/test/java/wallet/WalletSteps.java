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

        //prevent
        Given("there is $100 in my wallet", () -> {
            wallet.displayBalance(100);
            Assert.assertEquals("Incorrect display of account balance",100,wallet.getInitialBalance());
        });
        Given("there is $1 in my wallet", () -> {
            wallet.displayBalance(1);
            Assert.assertEquals("Incorrect display of account balance",1,wallet.getInitialBalance());
        });
        Given("there is $-1 in my wallet", () -> {
            wallet.displayBalance(-1);
            Assert.assertEquals("Incorrect display of account balance",-1,wallet.getInitialBalance());
        });
        When("I withdraw $200", () -> {
            wallet.withdrawFromWallet(200);
        });
        When("I withdraw $10", () -> {
            wallet.withdrawFromWallet(10);
        });
        When("I withdraw $1", () -> {
            wallet.withdrawFromWallet(1);
        });
        Then("nothing should be dispensed", () -> {
            wallet.displayBalance(100);
            wallet.withdrawFromWallet(200);
            Assert.assertNotEquals("You don't have enough money in your wallet!",wallet.getInitialBalance(),wallet.withdrawFromWallet(200));
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            wallet.displayBalance(100);
            String comment = "You don't have enough money in your wallet !";
            Assert.assertEquals(comment, wallet.withdrawFromWallet(200));
        });


        //display
        Given("there is $3 in my wallet", () -> {
            wallet.displayBalance(3);
            Assert.assertEquals("Incorrect display of account balance",3,wallet.getInitialBalance());
        });
        Given("there is $125 in my wallet", () -> {
            wallet.displayBalance(125);
            Assert.assertEquals("Incorrect display of account balance",125,wallet.getInitialBalance());
        });
        Given("there is $999 in my wallet", () -> {
            wallet.displayBalance(999);
            Assert.assertEquals("Incorrect display of account balance",999,wallet.getInitialBalance());
        });
        When("I check the balance of my wallet", () -> {
            wallet.getInitialBalance();
        });
        Then("I should see that the balance is $3", () -> {
            Assert.assertEquals("Incorrect wallet balance",3,wallet.getInitialBalance());
        });
        Then("I should see that the balance is $125", () -> {
            Assert.assertEquals("Incorrect wallet balance",125,wallet.getInitialBalance());
        });
        Then("I should see that the balance is $999", () -> {
            Assert.assertEquals("Incorrect wallet balance",999,wallet.getInitialBalance());
        });
    }
}