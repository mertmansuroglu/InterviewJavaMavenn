package tallestCandle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import plusMinusProblem.PlusMinus;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static tallestCandle.TallestCandle.birthdayCakeCandle;
import static tallestCandle.TallestCandle.birthdayCakeCandleWithStream;

class TallestCandleTest {

    @Test
    void tallestCandleTest() {
        List<Integer> arrList=Arrays.asList(4,4,1,3);
        Assertions.assertEquals(2,birthdayCakeCandle(arrList));
        Assertions.assertEquals(2,birthdayCakeCandleWithStream(arrList));

    }
}