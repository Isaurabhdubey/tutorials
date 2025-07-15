public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str = "axx#bb#cd";
        String str3 = "axx#bb#cd";

//        char[] ca = str.toCharArray();
        String str2 = "";
        for (char ch : str.toCharArray()) {
            if(ch == '#') {
                str2 = str2.substring(0, str2.length()-1);
                System.out.println(str2);
            } else {
                str2 = str2 + ch;
                System.out.println(str2);
            }
            System.out.println(ch);
        }
        System.out.println(str2);
        char[] ca2 = str3.toCharArray();
        String str4 = "";
        for (char ch : ca2) {
            if(ch == '#') {
                str4 = str4.substring(0, str4.length()-1);
                System.out.println(str4);
            } else {
                str4 = str4 + ch;
                System.out.println(str4);
            }
            System.out.println(ch);
        }
        System.out.println(str2.equals(str4));
    }
}