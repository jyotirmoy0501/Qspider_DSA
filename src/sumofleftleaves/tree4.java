package sumofleftleaves;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree4 {

    public int sumOfLeftLeaves(Node root) {
        if (root == null)
            return 0;

        int sum = 0;

        if (root.left != null &&
                root.left.left == null &&
                root.left.right == null) {

            sum += root.left.data;
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

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
        tree4 obj = new tree4();

        int result = obj.sumOfLeftLeaves(root);

        System.out.println("Sum of Left Leaf Nodes = " + result);
    }
}