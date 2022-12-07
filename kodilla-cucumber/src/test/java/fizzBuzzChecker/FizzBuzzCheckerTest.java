package fizzBuzzChecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzCheckerTest implements En {

    private int number;
    private String answer;

    public void FizzBuzzSteps() {
        Given("number is 1", () -> {
            this.number = 1;
        });
        Given("number is 3", () -> {
            this.number = 3;
        });
        Given("number is 5", () -> {
            this.number = 5;
        });
        Given("number is 15", () -> {
            this.number = 15;
        });

        When("I check divisibility by 3 and 5", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkNumber(this.number);
        });

        Then("Return a message {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }

}