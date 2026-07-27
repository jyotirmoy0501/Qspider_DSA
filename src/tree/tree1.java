package tree;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class tree1 {

    int sum = 0;
    public int sumOfAll(Node root) {
        traverse(root);
        return sum;
    }
    void traverse(Node root) {
        if (root == null) {
            return;
        }

        sum += root.val;
        traverse(root.left);
        traverse(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(8);

        root.right.left = new Node(12);

        tree1 tree = new tree1();

        int result = tree.sumOfAll(root);

        System.out.println("Sum of all nodes = " + result);
    }
}