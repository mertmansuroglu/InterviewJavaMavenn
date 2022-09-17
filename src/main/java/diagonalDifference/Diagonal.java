package diagonalDifference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Diagonal {


    public  int diagonalDiff(List<List<Integer>> arr) {
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
