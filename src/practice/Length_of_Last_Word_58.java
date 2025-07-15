package practice;

import java.util.Arrays;

public class Length_of_Last_Word_58 {
    public static void main(String[] args) {
        String s = "Hello World";
        String strArr =  s.substring(s.trim().lastIndexOf(" ")+1, s.length());
        System.out.println(s.trim().lastIndexOf(" "));
        System.out.println(strArr);
        System.out.println(s.length() - (s.trim().lastIndexOf(" ")+1));
    }
}
