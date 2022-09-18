package tallestCandle;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TallestCandle {
    public  static int birthdayCakeCandle(List<Integer> candles) {
        int max=Collections.max(candles);
        int maxCount=0;
        for(int i=0;i<candles.size();i++){
            if(candles.get(i)==max){
                maxCount++;
            }
        }
        return maxCount;
    }
    public  static int birthdayCakeCandleWithStream(List<Integer> candles) {
        int max=candles.stream().max(Comparator.naturalOrder()).get();
        return (int) candles.stream().filter(i->i==max).count();
    }
}
