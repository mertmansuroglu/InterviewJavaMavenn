package findDuplicateInString;

import java.util.*;

public class FindDuplicateStr {


    public List<String> findDup(String s) {
        char[] ch = s.toCharArray();
        List<String> list = new ArrayList<>();
        Set<String> setList = new HashSet<>();
        System.out.print("the duplicate elements are:");
        for (Character a : ch) {

            if (setList.add(String.valueOf(a)) == false) {
                System.out.print(a);
                list.add(String.valueOf(a));

            }
        }
        System.out.print("\n");
        Iterator<String> iterator = setList.iterator();
        System.out.print("non duplicate elements are:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        return list;
    }

}
