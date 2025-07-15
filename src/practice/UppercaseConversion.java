package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a Java program to convert a list of strings to uppercase or lowercase using streams
 */
public class UppercaseConversion {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "Cds", "xyz");
        List<String> lowercase = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> uppercase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("=============Start===========");
        System.out.println(lowercase);
        System.out.println("UpperCase: "+uppercase);
        System.out.println("=============End===========");
    }
}
