package tree;

import java.util.Map;

public class DFSTree {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    public static int getDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public static void dfsTravelsal(TreeNode root) {
        if(root == null) return;
        System.out.print(root.data);
        dfsTravelsal(root.left);
        dfsTravelsal(root.right);
    }
    public static boolean searchInBST(TreeNode root, int key) {
        if(root== null) return false;
        if(root.data < key) {
            return searchInBST(root.right, key);
        } else if( root.data > key) {
            return searchInBST(root.left, key);
        } else {
            return true;
        }
    }
    public static TreeNode insertBinaryTree(TreeNode node, int val) {
        if(node == null) {
            node = new TreeNode(val);
            return node;
        }
        if(node.data > val) {
            node.left = insertBinaryTree(node.left, val);
        } else {
            node.right = insertBinaryTree(node.right, val);
        }
        return node;
    }
    public static void main(String[] args) {
        int[] values = new int[]{3,7,4,5,6, 2,1};
        TreeNode root = null;
        for (int val: values) {
            root = insertBinaryTree(root, val);
        }
        System.out.println(getDepth(root));
        System.out.println("=========");
        dfsTravelsal(root);
        System.out.println("====after===");
        System.out.println(searchInBST(root, 9));
    }
}
