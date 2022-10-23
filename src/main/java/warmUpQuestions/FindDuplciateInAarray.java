package warmUpQuestions;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplciateInAarray {
    Integer[] arr = {1, 2, 3, 4, 4, 6, 6};

    @Test
    public void testHashSet() {
        Set<Integer> setList = new HashSet<>();
        for (Integer store : arr) {
            //false eger duplicate value yi eklmeye calistigimizda gelir cunku eklenemez!!!
            if (setList.add(store) == false) {
                System.out.println("duplicate element is:" + store);
            }
        }
    }

    @Test
    public void testHashMap() {
        Map<Integer, Integer> storeMap = new HashMap<>();
        for (Integer store : arr) {
            Integer count = storeMap.get(store);
            if (count == null) {
                storeMap.put(store, 1);
            } else
                storeMap.put(store, ++count);
        }
        Set<Map.Entry<Integer, Integer>> entrSet = storeMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrSet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }

        }
    }
}
