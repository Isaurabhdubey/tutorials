package practice;

import java.util.*;

public class LikedHasSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("apple");
        list.add("banana");
        list.add("banan");
        list.add("banana");
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("banan");
        set.add("banana");
        System.out.println(set);
        Integer[] arr = {2, 3, 5, 6, 7, 14, 23,21};
        Integer[] arr2 = {2, 3, 9, 10,12};
        TreeSet<Integer> treeset= new TreeSet<>();
        treeset.addAll(Arrays.asList(arr));
        treeset.addAll(Arrays.asList(arr2));
        System.out.println(treeset);
    }
}
