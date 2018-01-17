package kata.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzShould {

    @Test
    public void fizz_when_divisible_by_3() { assertEquals("Fizz", FizzBuzzRecursive.fizzBuzz(3));
    }

    @Test
    public void buzz_when_divisible_by_5() { assertEquals("Buzz", FizzBuzzRecursive.fizzBuzz(5));
    }

    @Test
    public void fizzbuzz_when_divisible_by_3_and_5() {
        assertEquals("FizzBuzz", FizzBuzzRecursive.fizzBuzz(15));
    }

    @Test
    public void returns_value_otherwise() {
        assertEquals("1", FizzBuzzRecursive.fizzBuzz(1));
    }


    /*
    @Test
    public void performance() {
        for (long i = 1; i < 10000L; i++) {
            kata.fizzbuzz.fizzBuzz.fizzBuzz(i);
        }
    }
*/
}