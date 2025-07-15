package practice;

import java.util.Arrays;

public class FindNumbers {
    public static int findNumbers(){
        int[] array = new int[]{1,12,345,6,7,7898};
        long count = Arrays.stream(array).filter(v-> {
            return String.valueOf(v).length()%2==0;
        }).count();
        return (int) count;
    }
    public static void main(String[] args) {

        System.out.println(findNumbers());
    }
}
