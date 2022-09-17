package practices.plusMinusProblem;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 1, 1, 0, -1, -1};
        List<Integer> list= Arrays.asList(array);
        plusMinus(list);
    }

    public static void plusMinus(List<Integer> arr) {
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        DecimalFormat df = new DecimalFormat("#.000000");
        df.setRoundingMode(RoundingMode.CEILING);
        //post increment once atar sonraki stepte arttirir
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                negativeCount++;
            } else if (arr.get(i)>0) {
                positiveCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.println(df.format(((double)positiveCount/arr.size())));
        System.out.println(df.format(((double)negativeCount/arr.size())));
        System.out.println(df.format(((double)zeroCount/arr.size())));
    }

}
