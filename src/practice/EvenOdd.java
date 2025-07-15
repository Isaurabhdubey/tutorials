package practice;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(7, 2, 3, 4,5);
        // odd 1,3,5
        // even 2, 4
        List<Integer> oddList = new ArrayList<Integer>();
        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> sortedInt = array.stream().sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedInt);

        sortedInt.forEach(val-> {
            if(val%2 ==0) {
                evenList.add(val);
            } else {
                oddList.add(val);
            }
        });

        System.out.println("oddList = "+ oddList);
        System.out.println("evenList = "+ evenList);
    }
}
