package tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
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
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static Node insertInvert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.right = insertInvert(root.right, val);
        } else {
            root.left = insertInvert(root.left, val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root== null) {
            return;
        }
        System.out.print(root.data+ " ");
        inorder(root.left);
        inorder(root.right);
    }
    public static void levelOrder( Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+ " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static Node invertTree(Node root) {
        if(root == null) {
            return null;
        }
        Node leftSubTree = invertTree(root.left);
        Node rightSubTree = invertTree(root.right);
        root.left = rightSubTree;
        root.right = leftSubTree;
        return root;
    }

    public static void main(String[] args) {
        int arr[]= {4,2,7,1,3,6,9};
        Node root = null;
        for (int a: arr) {
            root = insert(root, a);
        }
        inorder(root);
        System.out.println();
        levelOrder(root);
//        Node levelorderTree=  invertTree(root);
//        System.out.println();
//        levelOrder(levelorderTree);
//        Node root2 = null;
//        for (int a: arr) {
//            root2 = insertInvert(root2, a);
//        }
//        System.out.println("===");
//        inorder(root2);
//        System.out.println("===");
//
//        levelOrder(root2);
    }
}
