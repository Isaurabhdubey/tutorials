package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a Java program to remove all duplicate elements from a list using streams.
 */
public class DuplicateList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("saurabh", "kumar", "dubey", "sau", "Saurabh", "ar");
        List<String> uniq =  list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniq);
        List<String> uniqValue = list.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());
        System.out.println(uniqValue);
    }
}
