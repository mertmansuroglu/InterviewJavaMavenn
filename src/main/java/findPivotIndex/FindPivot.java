package findPivotIndex;


public class FindPivot {


    public int pivotIndex(int[] nums) {

        int rightsum = 0;
        int total = 0;
        for (int a = 0; a < nums.length; a++) {
            total += nums[a];

        }
        for (int b = 0; b < nums.length; b++) {

            if (rightsum == (total - rightsum - nums[b])) {
                return b;
            }
            rightsum += nums[b];
        }
        return -1;
    }

    public int pivotIndexAlternative(int[] nums) {

        int rightsum = 0;
        int leftsum = 0;
        int totalsum = 0;
        int sum = 0;
        for (int a = 0; a < nums.length; a++) {
            totalsum += nums[a];

        }
        for (int b = 0; b < nums.length; b++) {
            sum += nums[b];
            rightsum = totalsum - sum;
            leftsum = totalsum - nums[b] - rightsum;
            if (rightsum == leftsum) {
                return b;
            }
        }
        return -1;
    }
}
