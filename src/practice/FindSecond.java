package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecond {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 12, 23, 4, 6, 2);
        Integer acs= list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        Integer desc = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(acs);
        System.out.println(desc);
    }
}
