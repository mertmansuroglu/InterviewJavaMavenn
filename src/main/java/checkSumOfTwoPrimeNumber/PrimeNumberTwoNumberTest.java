package checkSumOfTwoPrimeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeNumberTwoNumberTest {

    @Test
    void primeNumberTest() {
        int a = 34;
        Assertions.assertTrue(PrimeNumberTwoNumber.checkPrimeNumberWithTwo(a));
    }

    @Test
    void primeNumberNegativeTest() {
        int a = 11;
        Assertions.assertFalse(PrimeNumberTwoNumber.checkPrimeNumberWithTwo(a));
    }
}
