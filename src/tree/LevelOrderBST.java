package tree;

public class LevelOrderBST {
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
    private static Integer previousValue;

    private static boolean inOrderTraversal(Node node) {
        if (node == null) {
            return true;
        }
        if (!inOrderTraversal(node.left)) {
            return false;
        }
        if (previousValue != null && previousValue >= node.data) {
            return false;
        }
        previousValue = node.data;
        if (!inOrderTraversal(node.right)) {
            return false;
        }
        return true;
    }
    public static boolean isValidBST(Node root) {
        previousValue = null; // Initialize previousValue as null before starting traversal
        return inOrderTraversal(root);
    }

    public static void main(String[] args) {
        int arr[] = {5,1,4,3,6};
        Node root = null;
        for (int v: arr) {
            root = insert(root, v);
        }
        System.out.println(isValidBST(root));

    }
}
