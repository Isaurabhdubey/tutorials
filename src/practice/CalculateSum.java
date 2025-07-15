package practice;

import java.util.*;

/**
 * Write a Java program to calculate the sum of all even, odd numbers in a list using streams
 */
public class CalculateSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 20, 33);
        Integer sumEven = list.stream().filter(v-> v%2==0).mapToInt(Integer::intValue).sum();
        Integer sumOdd = list.stream().filter(v-> v%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println("========Start=====");
        System.out.println("even sum is : "+sumEven);
        System.out.println("odd sum is : "+sumOdd);
        System.out.println("========end=====");

    }
}
