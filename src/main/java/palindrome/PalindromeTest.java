package palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void palindromeTest() {
        int number = 75257;
        Assertions.assertTrue(Palindrome.palindrome(number));
        Assertions.assertTrue(Palindrome.testAlternative(number));
    }
}