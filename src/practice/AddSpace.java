package practice;

public class AddSpace {
    public static String addSpaces(String s, int[] spaces) {
//        String str = "";
//        int startIndex = 0;
//        for (int endIndex: spaces) {
//            str = str + ((startIndex!=0 || endIndex == 0)? " ": "") + s.substring(startIndex, endIndex);
//            startIndex = endIndex;
//        };
//        if(startIndex < s.length()) {
//            str = str + ((startIndex!=0)? " ": "") + s.substring(startIndex, s.length());
//        }
//        return str;
        if(spaces.length==0) {
            return s;
        }
        // String str = "";
        // int startIndex = 0;
        for (int index=0; index< spaces.length;index++) {
            // str = str + ((startIndex!=0 || endIndex == 0)? " ": "") + s.substring(startIndex, endIndex);
            // startIndex = endIndex;
            s = " "+s.substring(spaces[index]+index);
        };
        // if(startIndex < s.length()) {
        //     str = str + ((startIndex!=0)? " ": "") + s.substring(startIndex, s.length());
        // }
        return s;
    }

    public static void main(String[] args) {
        String s = "spacing";
        int[] spaces = new int[]{0,1,2,3,4,5,6};
        String finalString = addSpaces(s, spaces);
        System.out.println(finalString);
    }

}
