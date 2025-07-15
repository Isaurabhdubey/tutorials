package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "abb#cdd##";
        StringBuilder result = new StringBuilder();
        IntStream.range(0, str.length())
                .filter(i -> str.charAt(i)!='#' && (i == str.length() -1 || str.charAt(i+1)!='#'))
                .mapToObj(str::charAt)
                .forEach(result::append);
        System.out.println(result);
//        str.split("");
//        StringBuilder str2 = new StringBuilder();
//        Arrays.stream(str.split(""))
//                        .forEach(c-> {
//                            if(c.equals("#")) {
//                                str2.deleteCharAt(str2.length()-1);
//                            } else {
//                                str2.append(c);
//                            }
//                        });
//        System.out.println(str2);



//        StringBuilder
//                str4
//                = new StringBuilder("WelcomeGeeks");
//
//        // print string
//        System.out.println("Before removal String = "
//                + str4.toString());
//
//        // remove the substring from index 2 to 8
////        StringBuilder afterRemoval = str4.delete(2, 8);
//        System.out.println(str4);
//        System.out.println(afterRemoval);
    }
}
