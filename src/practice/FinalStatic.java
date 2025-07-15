package practice;

import java.util.*;
public class FinalStatic {
    public static final List<String> list = new ArrayList<>();
    public final List<String> list1 = new ArrayList<>();

    public static void main(String[] args) {
        list.add("Str");
        System.out.println(list);
    }
}
