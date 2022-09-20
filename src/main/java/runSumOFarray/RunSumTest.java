package runSumOFarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RunSumTest {

    @Test
    void runningSumTestWithExpectedInput() {

        Integer[] array = {1, 2, 3, 4};
        Integer[] ans={1,3,6,10};
        RunSum runSum= new RunSum();
        List<Integer> arrayListInput= Arrays.asList(runSum.runningSum(array));
        List<Integer> arrayListAnswer= Arrays.asList(ans);
        Assertions.assertTrue(arrayListInput.equals(arrayListAnswer));

    }

    @Test
    void runningSumTestWithRecursive(){
        int[] array = {1, 3, 5, 7};
        int[] ans={1,4,9,16};
        RunSum runSum= new RunSum();
        runSum.runningSumWithRecursive(array,0);
        Assertions.assertArrayEquals(array,ans);
    }
}