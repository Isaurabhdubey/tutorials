package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPallindrom {
    private static String reverseAString(String st, Map<String, List<Integer>> alreadyExistedMappedString) {
        StringBuilder str = new StringBuilder(st);
        StringBuilder str2 = new StringBuilder(str).reverse();
        String resultString = "";
        if(str.toString().equals(str2.toString())) {
            return str.toString();
        }
        for(int i=0; i< st.length(); i++) {
            if(alreadyExistedMappedString.get(String.valueOf(st.charAt(i)))!= null) {
                String isPallindromNumber = isPallindrom(st, String.valueOf(st.charAt(i)), i, alreadyExistedMappedString);
                if(resultString.length() < isPallindromNumber.length()) {
                    resultString = isPallindromNumber;
                }
                alreadyExistedMappedString.get(String.valueOf(st.charAt(i))).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                alreadyExistedMappedString.put(String.valueOf(st.charAt(i)), list);
            }
        }
        if(st.length() > 0 && resultString.length() ==0) {
            resultString = st.substring(0,1);
        }
        return resultString;
    }
    public static String isPallindrom(String s, String s2, int currentIndex, Map<String, List<Integer>> alreadyExistedMappedString) {
        String resultString = "";
        for (Integer index: alreadyExistedMappedString.get(s2)) {
            StringBuilder str = new StringBuilder(s.substring(index, currentIndex+1));
            StringBuilder str2 = new StringBuilder(str).reverse();
            if(str.toString().equals(str2.toString())) {
                if(resultString.length() < str.length()) {
                    resultString = str.toString();
                }
            }
        }
        return resultString;
    }
    public static void main(String[] args) {
        String str = "babad";
        Map<String, List<Integer>>mapped = new HashMap<>();
        System.out.println(reverseAString(str, mapped));
    }
}
