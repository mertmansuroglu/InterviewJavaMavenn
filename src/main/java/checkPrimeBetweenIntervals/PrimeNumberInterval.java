package checkPrimeBetweenIntervals;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberInterval {

    public  static void primeNumberInterval(int number,int number2) {
    List<Integer> list= new ArrayList<>();
     for(int i=number;i<=number2;i++){
         list.add(i);
     }
       while(number<=number2)
       {
           for(int i=2;i<=number;i++){
               if(i!=2&&i!=number){
                   if(number%i==0){
                       list.remove(list.indexOf(number));
                       break;
                   }
               }
           }
           number++;
       }
        if(number<=0){
            list.remove(list.indexOf(number));
        }
        System.out.println(list);

    }






}
