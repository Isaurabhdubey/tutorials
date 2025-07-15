package practice;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int pairCount=0, countOpeningParentheses = 0;
        for (String str: s.split("")) {
            System.out.println(str);
            if(str.equals(")") && countOpeningParentheses>0) {
                pairCount++;
                countOpeningParentheses--;
            } else if (str.equals("(")) {
                countOpeningParentheses++;
            }
        }
        return (pairCount-countOpeningParentheses)*2;
    }
    public static void main(String[] args) {
        String s = "()(()";
        System.out.println(longestValidParentheses(s));
    }
}
