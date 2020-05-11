import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Case: 3")
    void testFizzBuzz_3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 5")
    void testFizzBuzz_5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 15")
    void testFizzBuzz_15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 4")
    void testFizzBuzz_4() {
        int number = 4;
        String expected = "4";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}