import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fb237() {
        String[] expected = {"1", "fizz", "buzz", "fizz", "5", "fizzbuzz", "7"};

        String[] result = FizzBuzz.fb(2, 3, 7);
        assertTrue(compare(expected, result));
    }

    @Test
    public void fb247() {
        String[] expected = {"1", "fizz", "3", "fizzbuzz", "5", "fizz", "7"};

        String[] result = FizzBuzz.fb(2, 4, 7);
        assertTrue(compare(expected, result));
    }

    @Test
    public void fb357() {
        String[] expected = {"1", "2", "fizz", "4", "buzz", "fizz", "7"};

        String[] result = FizzBuzz.fb(3, 5, 7);
        assertTrue(compare(expected, result));
    }

    private boolean compare(String[] expected, String[] result) {
        System.out.println(Arrays.toString(result));
        if (expected.length != result.length) return false;
        for (int i = 0; i<expected.length; i++) {
            if (!expected[i].equals(result[i])) {
                return false;
            }
        }
        return true;
    }
}
