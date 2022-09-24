package sortArrayTwins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayTwins {
    public static void main(String[] args) {
        //1.once delimeter ile : den sonrasini alirim arrayliste atarim VE SORTLARIM
        //2. sonra concat yapip : den sonrasi ile replacederim regex ile
        //3.arrayi printlerim
        String str[]={"Suresh:20","Ramesh:10","Anand:05"};
        List<Integer> list= new ArrayList<>();
        for(String s:str){
            list.add(Integer.parseInt(s.substring(str[0].indexOf(":")+1)));
        }
        Collections.sort(list);
        String str2[]=new String[str.length];
        for(int i=0;i<list.size();i++){
         String result=  str[i].replaceAll("(?<=:)[\\w\\.?]+", String.valueOf(list.get(i)));
            str2[i]=result;
        }
        System.out.println(Arrays.toString(str2));

    }
}
