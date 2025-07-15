package practice; /**
 * Write a program to calculate the average of list
 */
import java.util.*;
public class AverageList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,6,8,10,18, 36);
        double avg = list.stream().mapToDouble(Integer::doubleValue)
                .average().orElse(0.0);
        System.out.println(avg);
    }
}
