package fizzBuzzChecker;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/fizzBuzzChecker/fizz_buzz.feature"}
)
public class FizzBuzzRunner {
}
