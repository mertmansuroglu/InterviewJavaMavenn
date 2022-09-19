package checkPrimeNumber;

public class PrimeNumber {

    public  static boolean primeNumber(int number) {
        for(int i=1;i<=number;i++){
            if(i!=1&&i!=number){
                if(number%i==0){
                    return false;
                }
            }
        }
        if(number<=0){
            return false;
        }
        else
            return true;

    }




}
