package warmUpQuestions;

import java.util.Arrays;
import java.util.BitSet;

public class PrintArrayFrom1to100WithoutLoop {
    public static void main(String[] args) {
        Object[] num = new Object[100];
        Arrays.fill(num, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return Integer.toString(++count);
            }

        });
        System.out.println(Arrays.toString(num));

        ///we can use bitset without arrays
        String set = new BitSet() {{
            set(1, 101);
        }}.toString();
        //adding apiAutomation.data to result = append
        System.out.append(set, 1, set.length());
    }
}
