package reverseNumber;

import org.junit.jupiter.api.Test;

public class ReverseNumber {
    public static void main(String[] args) {
        int a=123456;
        char[] ch= Integer.toString(a).toCharArray();
        char[] newArr=new char[ch.length];
        int b=0;
        for(int i=ch.length-1;i>=0;i--){
            newArr[b]=Character.valueOf(ch[i]);
            b++;
        }
        System.out.println(Integer.parseInt(String.valueOf(newArr)));
     ;
    }
    @Test
    public void testAlternative(){
        int num=1234;
        int rev=0;

        while(num!=0){
            int n=num%10;
            rev=rev*10+n;
            num=num/10;

        }
        System.out.println(rev);
    }
    @Test
    public void testAlternativeStringReverse(){
        String a="abcde";
        char[] ch= a.toCharArray();
        char[] newArr=new char[ch.length];
        int b=0;
        for(int i=ch.length-1;i>=0;i--){
            newArr[b]=Character.valueOf(ch[i]);
            b++;
        }
        System.out.println(newArr);
        ;
    }
}
