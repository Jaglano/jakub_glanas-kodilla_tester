package fizzBuzzChecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {

    private int number;
    private String answer;

    public  FizzBuzzSteps() {


        Given("number is {int}", (Integer int1) -> {
            this.number = int1;
        });

        When("I check divisibility", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkNumber(this.number);
        });

        Then("Return a message {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }

}