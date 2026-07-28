package sumofleftleaves;

import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree4 {

    public static int sumOfLeftLeaves(Node root) {
        if (root == null)
            return 0;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        int sum = 0;

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.left != null) {

                if (current.left.left == null && current.left.right == null) {
                    sum += current.left.data;
                } else {
                    stack.push(current.left);
                }
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(26);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(5);

        root.right.left = new Node(3);
        root.right.right = new Node(4);

        root.right.left.left = new Node(8);

        int result = sumOfLeftLeaves(root);

        System.out.println("Sum of Left Leaf Nodes = " + result);
    }
}