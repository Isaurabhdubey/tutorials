package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,2,2};
        int count = num.length /2;
        int maximum = 0;
        HashMap<Integer, Integer> mapped= new HashMap<>();
        for (int i: num) {
            mapped.put(i, Optional.ofNullable(mapped.get(i)).orElse(0)+1);
        }
        for (Map.Entry<Integer, Integer> entry: mapped.entrySet()) {
            if(count <=  entry.getValue()) {
                maximum = entry.getKey();
                count = entry.getValue();
            }
        }
        System.out.println(maximum);
    }
}
