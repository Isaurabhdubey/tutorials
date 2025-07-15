package practice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static int factorial(int num) {
        if(num==0) {
            return 1;
        }
        return num * factorial(num -1);
    }

}
