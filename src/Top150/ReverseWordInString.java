package Top150;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordInString {
    public static String reverseWords(String s) {
        if(s== null) {
            return null;
        }
        s = trimExtraSpaces(s);
        if(s.isEmpty()) {
            return s;
        }
        // String[] str = s.split(" ");
        StringBuilder str1= new StringBuilder();
        StringBuilder local = new StringBuilder();;
        for(int i=s.length()-1; i> -1; i--) {
            local.append(s.charAt(i));
//            System.out.println(s.charAt(i));
            if(" ".equals(String.valueOf(s.charAt(i)))) {
                System.out.println(" s1 "+local);
                str1.append(local.reverse());
                System.out.println(" s1 "+str1);
                local.delete(0, local.length());
            } else if(i==0) {
                System.out.println(" s2 "+local);
                str1.append(local.reverse());
                System.out.println(" s2 "+str1);
                local.delete(0, local.length());
            }
        }
        // for (int i=str.length-1; i>-1; i--) {
        //     str1.append(str[i]);
        //     if(i!=0) {
        //         str1.append(" ");
        //     }
        // }
        return str1.toString();
    }
    public static String trimExtraSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverseWords(s));

//        String textWithExtraSpaces = "  This   is  a  string  with  extra spaces.  ";
//        String trimmedText = trimExtraSpaces(textWithExtraSpaces);
//        System.out.println("Original text: \"" + textWithExtraSpaces + "\"");
//        System.out.println("Trimmed text: \"" + trimmedText + "\"");
    }
}
