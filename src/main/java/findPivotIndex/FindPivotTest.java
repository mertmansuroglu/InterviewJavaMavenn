package findPivotIndex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotTest {

    @Test
    void pivotIndexWithExpectedInputTest() {
        int[] array = {1, 7, 1};
        FindPivot findPivot= new FindPivot();
        findPivot.pivotIndex(array);
        assertEquals(1,findPivot.pivotIndex(array));
    }

    @Test
    void pivotIndexWithUnExpectedInputTest() {
        int[] array = {1,6,8,9,2,7, 1 };
        FindPivot findPivot= new FindPivot();
        findPivot.pivotIndex(array);
        assertEquals(-1,findPivot.pivotIndex(array));
    }

    @Test
    void pivotIndexWithZeroTest() {
        int[] array = {1,-1,1};
        FindPivot findPivot= new FindPivot();
        findPivot.pivotIndex(array);
        assertEquals(0,findPivot.pivotIndex(array));
    }
}