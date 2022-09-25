package maximumWordCountInTextFile;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class MaximumWordCount {

    public static void findMaxWord(String FileName) {
        BufferedReader fr = null;
        HashMap<String, Integer> map = new HashMap<>();
        //eger bosluk olarak ayiracaktik splitle
        //buffered reader sectik cunkku readline var

        try {
            fr = new BufferedReader(new FileReader(FileName));
            String st;
            List<String> list= new ArrayList<>();
            while ((st = fr.readLine()) != null) {
                list.add(st);
            }
            for(int i=0;i<list.size();i++){
                if(map.containsKey(list.get(i))){
                    map.put(list.get(i),map.get(list.get(i))+1);
                }else{
                    map.put(list.get(i),1);
                }
            }
            map.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() == Collections.max(map.values()))
                    .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
