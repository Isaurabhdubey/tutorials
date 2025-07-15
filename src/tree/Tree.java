package tree;

public class Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    };
    static class BuildTree {
        int index = -1;
        public Node formTree(int[] root) {
            index++;
            if(root[index] == -1) {
                return null;
            }
            Node currentNode = new Node(root[index]);
            currentNode.left = formTree(root);
            currentNode.right = formTree(root);
            return currentNode;
        }
    }

    public static void inorderprint(Node root) {
        if(root==null) {
            return;
        }
        inorderprint(root.left);
        System.out.print(root.data+ "");
        inorderprint(root.right);
     }
    public static void postorderprint(Node root) {
        if(root==null) {
            return;
        }
        inorderprint(root.right);
        System.out.print(root.data+ "");
        inorderprint(root.left);
    }



    public static void main(String[] args) {
        int[] arr = { 5, 1, -1, 3,2,-1,-1,4,-1,-1,7,-1,-1};
        BuildTree tree = new BuildTree();
        Node currentFormedTree = tree.formTree(arr);
        System.out.println(currentFormedTree.left.right.data);
        inorderprint(currentFormedTree);
        System.out.println();
        postorderprint(currentFormedTree);
    }
}
