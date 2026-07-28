package sumofleftleaves;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class tree4 {

    int sum = 0;

    void traverse(Node root) {

        if (root == null)
            return;

        if (root.left != null) {

            // Check if left child is a leaf
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.data;
            }
        }

        traverse(root.left);
        traverse(root.right);
    }

    int sumOfLeftLeaves(Node root) {
        sum = 0;
        traverse(root);
        return sum;
    }

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        tree4 obj = new tree4();

        System.out.println("Sum of Left Leaves = " + obj.sumOfLeftLeaves(root));
    }
}