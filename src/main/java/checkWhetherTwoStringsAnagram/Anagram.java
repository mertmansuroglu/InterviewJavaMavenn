package checkWhetherTwoStringsAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

    public static boolean checkAnagram(String a, String b) {
        String st1 = a.replaceAll("\\s", "");
        String st2 = b.replaceAll("\\s", "");
        if (st1.length() != st2.length()) {
            return false;
        }
        char[] charA = a.toLowerCase().toCharArray();
        char[] charB = b.toLowerCase().toCharArray();
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        for (char aa : charA) {
            listA.add(String.valueOf(aa));
        }
        Collections.sort(listA);
        for (char bb : charB) {
            listB.add(String.valueOf(bb));

        }
        Collections.sort(listB);
        return listA.equals(listB);
    }

    public static boolean checkAnagramAlter(String a, String b) {
        String st1 = a.replaceAll("\\s", "").trim();
        String st2 = b.replaceAll("\\s", "").trim();
        if (st1.length() != st2.length()) {
            return false;
        }
        char[] charA = a.toLowerCase().toCharArray();
        char[] charB = b.toLowerCase().toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        return Arrays.equals(charA, charB);
    }
}
