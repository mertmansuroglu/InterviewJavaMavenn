package findLengthOfStringWithoutUsingLengthMethod;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLengthString {

    @Test
    public void test(){
              findWithForLoopCharArray("MERT");
              findWithLastIndexOf("MERT");
              findWithSplitDeimeter("MERT");
              findWithRegex("MERT");
              findWithWhileLoop("MERT");

  }

    public static void findWithLastIndexOf(String str){
        System.out.println(str.lastIndexOf(""));
    }
    public static void findWithSplitDeimeter(String str){
        String st[]= str.split("");
        int count=0;
        for(String s:st){
            count++;
        }
        System.out.println(count);
    }
    public static void findWithRegex(String str){
        //we can use regex term to see the end of the string!!
        Matcher pattern= Pattern.compile("$").matcher(str);
        pattern.find();
        System.out.println(pattern.end());
    }
    public static void findWithForLoopCharArray(String str){
        int count=0;
        for(char c: str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
    public static void findWithWhileLoop(String str){
        //we can use while loop by getting use of char at
        int i=0;
        try {
            while(true){
                str.charAt(i);
                i++;
            }
        }catch (IndexOutOfBoundsException e){

        }
        System.out.println(i);
    }
}

