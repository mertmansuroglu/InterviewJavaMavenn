package runSumOFarray;

import findPivotIndex.FindPivot;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
}