package practices.runSumOFarray;

import org.testng.Assert;

public class RunSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] ans={1,3,6,10};
        Assert.assertEquals(ans,runningSum(array));

    }

    public static int[] runningSum(int[] nums){
      int[] newArray= new int[nums.length];
      newArray[0]=nums[0];
        for(int a=1;a<nums.length;a++){
                newArray[a]=newArray[a-1]+nums[a];
        }
        return newArray;
    }
}
//ctrl+shift+t  opens unit test class