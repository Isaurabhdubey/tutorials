package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Write a Java program to find the maximum and minimum values in a list of integers using streams.
 */
public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 6, 10, 23);
        Integer max_val = list.stream().max(Integer::compareTo).orElse(0);
        Integer min_val = list.stream().min(Integer::compareTo).orElse(0);
        System.out.println(max_val);
        System.out.println(min_val);
        Integer sortedFirst = list.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(0);
        System.out.println(sortedFirst);
    }
}
