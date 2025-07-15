package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsProblem {
    public static void main(String[] args) {
        String str= new String("ssdg");
        Map<Integer, List<String>> s = str.chars().mapToObj(value -> {
            return String.valueOf((char) value);
        }).collect(Collectors.groupingBy(String::length));
        System.out.println();
    }
}
