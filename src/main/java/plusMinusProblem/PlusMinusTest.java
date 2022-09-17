package plusMinusProblem;

import findPivotIndex.FindPivot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlusMinusTest {

    @Test
    void plusMinusTest() {
        Integer[] array = new Integer[] { 1, 1, 0, -1, -1};
        List<Integer> list= Arrays.asList(array);
        PlusMinus plusMinus= new PlusMinus();
        plusMinus.plusMinus(list);
    }

}