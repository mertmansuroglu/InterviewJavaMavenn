package practices.findPivotIndex;

import org.testng.Assert;

public class Test {

    public static void main(String[] args) {
        int[] array = {1, 7, 1};
//        pivotIndex(array);
        Assert.assertTrue(pivotIndexAlternative(array)==1);
    }

    public static int pivotIndex(int[] nums) {

        int rightsum = 0;
        int total=0;
        for (int a = 0; a < nums.length; a++)
        {
            total+=nums[a];

        }
        for(int b=0;b < nums.length;b++){

            if(rightsum==(total-rightsum-nums[b])){
                return b;
            }
            rightsum += nums[b];
        }
        return -1;
    }

    public static int pivotIndexAlternative(int[] nums) {

        int rightsum = 0;
        int leftsum = 0;
        int totalsum=0;
        int sum=0;
        for (int a = 0; a < nums.length; a++)
        {
            totalsum+=nums[a];

        }
        for(int b=0;b < nums.length;b++){
            sum+=nums[b];
            rightsum=totalsum-sum;
            leftsum=totalsum-nums[b]-rightsum;
            if(rightsum==leftsum){
                return b;
            }
        }
        return  -1;
    }
}
