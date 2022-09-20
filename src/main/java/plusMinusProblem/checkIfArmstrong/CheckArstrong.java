package plusMinusProblem.checkIfArmstrong;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckArstrong {

    public  static boolean checkArmstrong(int number) {
        char[] ch= String.valueOf(number).toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++){
            sum+= ((int)Math.pow(Integer.parseInt(String.valueOf(ch[i])),ch.length));
        }
        if(sum==number){
            return true;
        }
        return false;
    }
    public  static boolean checkArmstrongAlternative(int num) {
        List<Integer> arr= new ArrayList<>();
      int yedek=num;
        while(num!=0){
            int n=num%10;
            arr.add(n);
            num=num/10;

        }
       int sum= arr.stream().mapToInt(N -> (int) Math.pow(N, arr.size())).sum();
        if(sum==yedek){
            return true;
        }
        return false;
    }
    public  static boolean checkArmstrongAlternative2(int num) {

        int yedek=num;
        int result=0;
        int lentgh= String.valueOf(num).length();
        while(num!=0){
            int n=num%10;
            result+= (int) Math.pow(n,lentgh);
            num=num/10;

        }
        if(result==yedek){
            return true;
        }
        return false;
    }

}
