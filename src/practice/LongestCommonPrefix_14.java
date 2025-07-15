package practice;

public class LongestCommonPrefix_14 {
    private static String compareString(String s1, String s2) {
        String word= "";
        if(s1.equals(s2.substring(0, s1.length()))) {
            return s1;
        }
        for (int i=0; i< s1.length(); i++) {

            if(s1.charAt(i) == s2.charAt(i)) {
                word+= String.valueOf(s1.charAt(i));
            }else {
                break;
            }
        }
        return word;
    }
    public static void main(String[] args) {
        String[] strArr = {"Flower", "Fls", "Flow"};
        Integer count = strArr[0].length();
        String smallerWord = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            if(count > strArr[i].length()) {
                count = strArr[i].length();
                smallerWord = strArr[i];
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals(smallerWord)) {
                String word = compareString(smallerWord, strArr[i]);
                if (word.length() < smallerWord.length()) {
                    smallerWord = word;
                }
            }
        }

        System.out.println(smallerWord);

    }
}
