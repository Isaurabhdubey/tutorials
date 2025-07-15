package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
 */
public class SortString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
                Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> acs = list.stream().map(String::toLowerCase).sorted().collect(Collectors.toList());
        List<String> desc = list.stream().map(String::toLowerCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(acs);
        System.out.println(desc);
    }
}
