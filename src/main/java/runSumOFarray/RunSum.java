package runSumOFarray;


public class RunSum {

    public Integer[] runningSum(Integer[] nums){
        Integer[] newArray= new Integer[nums.length];
      newArray[0]=nums[0];
        for(int a=1;a<nums.length;a++){
                newArray[a]=newArray[a-1]+nums[a];
        }
        return newArray;
    }

    public static void runningSumWithRecursive(int[] nums, int startingIndexNo){
        if (startingIndexNo==nums.length-1) return;
        nums[startingIndexNo+1]+=nums[startingIndexNo];
        runningSumWithRecursive(nums,startingIndexNo+1);
    }
}
//ctrl+shift+t  opens unit test class