package countOccurencesOfChar;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class CheckCharOccurences {

    @Test
    public void checkCharOccurences() {
        HashMap<String, Integer> map = new HashMap<>();
        String str = "I love coding";
        char[] ch = str.toCharArray();
        int countI = 0;
        int countO = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.valueOf(ch[i]) == 'o') {
                countO++;
            } else if (Character.valueOf(ch[i]) == 'I') {
                countI++;
            }
        }
        map.put(String.valueOf('I'), countI);
        map.put(String.valueOf('o'), countO);
        System.out.println(map);
//          return map;
    }
}



