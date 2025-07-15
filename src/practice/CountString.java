package practice;

import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to count the number of strings in a list that start with a specific letter using streams.
 */
public class CountString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        char ctr = 'B';
        long count = list.stream().filter(v-> v.startsWith(String.valueOf(ctr))).count();
        System.out.println(count);
    }
}
