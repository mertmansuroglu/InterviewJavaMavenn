package twoSum;

import java.util.HashMap;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        //o(n2) complexity
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;

    }

    /*
     *
     *asagidaa map yardimi ile istnen elementi mape bakarak bulur o(n) complexity
     */
    public int[] twoSumAlternative(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            } else
                map.put(nums[i], i);
        }
        return null;
    }
}
