package practices.diagonalDifference;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Integer[][] array = new Integer[][] {{1,2,3},{4,5,6},{9,8,9}};
        List<List<Integer>> list=  Arrays.stream(array).map(Arrays::asList).collect(Collectors.toList());
        System.out.println( diagonalDiff(list));
    }

    public static int diagonalDiff(List<List<Integer>> arr) {
        int leftdiagonal=0;
        int rightdiagonal=0;
        int sonuc;
        for(int i=0;i<arr.size();i++) {
            for (int a = 0; a < arr.size(); a++) {
                if (i == a) {
                    leftdiagonal += arr.get(i).get(i);
                }
            }
        }
            for(int i=0;i<arr.size();i++){
                for(int a=0;a<arr.size();a++){
                    if(i+a==(arr.size()-1)){
                        rightdiagonal+=arr.get(i).get(a);
                    }
                }

        }
        return Math.abs(leftdiagonal-rightdiagonal);
    }
}
