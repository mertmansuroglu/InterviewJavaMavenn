package checkSumOfTwoPrimeNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeNumberTwoNumber {


    public static List<Integer> primeNumber(int toCheckNum) {
        List<Integer> list = new ArrayList<>();
        int newNum = 2;
        for (int i = newNum; i <= toCheckNum; i++) {
            list.add(i);
        }
        while (newNum <= toCheckNum) {
            for (int i = 2; i <= newNum; i++) {
                if (i != 2 && i != newNum) {
                    if (newNum % i == 0 | newNum % 2 == 0) {
                        list.remove((Integer) newNum);
                        break;
                    }
                }
            }
            newNum++;
        }
        if (newNum <= 0) {
            list.remove((Integer) newNum);
        }
        return list;
    }

    public static boolean checkPrimeNumberWithTwo(int toCheckNum) {
        List<Integer> list = primeNumber(toCheckNum);
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int x = toCheckNum - list.get(i);
            if (map.containsKey(x)) {
                result.put(list.get(i), x);
                System.out.println(result);
                return true;
            } else
                map.put(list.get(i), i);
        }
        return false;
    }
}
