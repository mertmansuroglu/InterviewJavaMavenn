package codesWithoutLoops;

public class Printfrom1ToNwithoutLoop {

    public static void main(String[] args) {
        increase(10,1);
    }
    private static  void increase(int N,int begin){

        if(begin <= N){
            System.out.print(begin+" ");
            begin=begin+1;
            increase(N,begin);
        }
        return;
    }
}
