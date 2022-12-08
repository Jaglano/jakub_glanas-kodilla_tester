Feature: FizzBuzz
  Scenario Outline: Check if the number is divisible by 3, is divisible by 5, is divisible by 3 and 5, or isn't divisible by 3 or 5
    Given number is <number>
    When I check divisibility
    Then Return a message <answer>
    Examples:
    |number|answer|
    |1|"None"|
    |3|"Fizz"|
    |5|"Buzz"|
    |15|"FizzBuzz"|