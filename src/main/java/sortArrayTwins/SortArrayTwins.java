package sortArrayTwins;

import java.util.*;

public class SortArrayTwins {
    public static void main(String[] args) {
        //1.once delimeter ile : den sonrasini alirim arrayliste atarim VE SORTLARIM
        //2. sonra concat yapip : den sonrasi ile replacederim regex ile
        //3.arrayi printlerim
        String str[] = {"Suresh:20", "Ramesh:10", "Anand:05"};
        String[] newArr;
        String[] newArr2;
        for (int i = 0; i < str.length; i++) {
            for (int a = 0; a < str.length - 1; a++) {
                 newArr= str[a].split(":");
                 newArr2= str[a+1].split(":");
                 if(Integer.parseInt(newArr2[1])<Integer.parseInt(newArr[1])){
                     String temp=str[a+1];
                     str[a+1]=str[a];
                     str[a]=temp;
                 }
        }
    }
        System.out.println(Arrays.toString(str));}

    }
