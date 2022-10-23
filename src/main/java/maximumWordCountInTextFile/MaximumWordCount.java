package maximumWordCountInTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MaximumWordCount {

    public static void findMaxWord(String FileName) {
        BufferedReader fr = null;
        HashMap<String, Integer> map = new HashMap<>();
        //eger bosluk olarak ayiracaktik splitle
        //buffered reader sectik cunkku readline var

        try {
            fr = new BufferedReader(new FileReader(FileName));
            String st;
            List<String> list = new ArrayList<>();
            while ((st = fr.readLine()) != null) {
                list.add(st);
            }
            for (int i = 0; i < list.size(); i++) {
                if (map.containsKey(list.get(i))) {
                    map.put(list.get(i), map.get(list.get(i)) + 1);
                } else {
                    map.put(list.get(i), 1);
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
