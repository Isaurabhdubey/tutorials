package practice;

public class AddTwoNumbers_2 {
      static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      static void createNode(ListNode l1, int[] arr, int index) {
          System.out.println(index);
          index++;
          while (index < arr.length) {
              System.out.println("Inside "+index);
              l1.val = arr[index];
              l1.next = new ListNode(-1);
              index++;
//              l1.next = createNode(l1.next, arr, index);
          }
      }
      static void print(ListNode l1) {
          System.out.println(l1.val);
          System.out.println(l1.next.val);
//          while(l1.next) {
//              print(l1.next);
//          }
      }
    public static void main(String[] args) {
          ListNode l1= new ListNode();
          createNode(l1, new int[]{2,3,4}, 0);
//        print(l1);
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public int findNumber(ListNode l1, int num, int index) {
//        if(l1.val != -1) {
//            index = index == 0? 1: (1* index);
//            num  = num + l1.val * index;
//        }
//        while(l1.next != null) {
//            findNumber(l1.next, num, 10 * index);
//        }
//        return num;
//    }
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int num1=findNumber(l1, 0,0);
//        int num2 = findNumber(l2, 0, 0);
//        return num1+ num2;
//    }
//}