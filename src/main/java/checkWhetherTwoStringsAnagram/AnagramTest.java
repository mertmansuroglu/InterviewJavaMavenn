package checkWhetherTwoStringsAnagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static checkWhetherTwoStringsAnagram.Anagram.checkAnagram;
import static checkWhetherTwoStringsAnagram.Anagram.checkAnagramAlter;

public class AnagramTest {

    @Test
    public void testAnagram() {
        String a = "CAt  ";
        String b = "aCT  ";
        Assertions.assertTrue(checkAnagram(a, b));
        Assertions.assertTrue(checkAnagramAlter(a, b));
    }
}
