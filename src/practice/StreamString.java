package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamString {
    public static void main(String[] args) {
        System.out.println("ABS");
        String[] input = {"football", "footcol", "foot"};

        Optional<String> min = Arrays.stream(input).min(Comparator.comparingInt(String:: length));
        if(min.isPresent()) {
            System.out.println(min.get());
        }
    }
}
