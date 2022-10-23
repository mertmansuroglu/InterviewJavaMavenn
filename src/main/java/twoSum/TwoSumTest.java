package twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expectedArr = {0, 1};
        Assertions.assertArrayEquals(expectedArr, new TwoSum().twoSum(nums, target));
        Assertions.assertArrayEquals(expectedArr, new TwoSum().twoSumAlternative(nums, target));
    }
}
