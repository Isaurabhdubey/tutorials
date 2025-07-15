package blind75;

import java.util.HashMap;
import java.util.Map;

public class BineryTreeUsingInOrderPreorder {
    static class Node {
       int data;
       Node left;
       Node right;
       Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
    }
    private int preOrderIndex = 0;
    private Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    public Node buildTree(int[] preOrder, int[] inOrder) {
        for (int i=0;i < inOrder.length; i++) {
            inorderIndexMap.put(inOrder[i], i);
        }
        return arrayToTree(preOrder, 0, inOrder.length-1);
    }
    private Node arrayToTree(int[] preorder, int left, int right) {
        if(left > right) return null;
        int rootValue = preorder[preOrderIndex++];
        Node root = new Node(rootValue);
        int inorderIndex = inorderIndexMap.get(rootValue);
        root.left = arrayToTree(preorder, left,  inorderIndex-1);
        root.right = arrayToTree(preorder, inorderIndex+1, right);
        return root;
    }
    private static void printInOrder(Node root) {
        if(root ==  null) return;
        printInOrder(root.left);
        System.out.println(root.data);
        printInOrder(root.right);
    }
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        BineryTreeUsingInOrderPreorder bineryTreeUsingInOrderPreorder = new BineryTreeUsingInOrderPreorder();
        Node root = bineryTreeUsingInOrderPreorder.buildTree(preorder, inorder);
        System.out.println(root.right.data);
        printInOrder(root);
    }
}
