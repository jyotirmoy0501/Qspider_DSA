public class marging_nodes {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeNodes(ListNode head) {

        int sum = 0;
        ListNode zero = head;
        ListNode temp = head.next;

        while (temp != null) {

            if (temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            } else {

                zero.val = sum;

                if (temp.next == null) {
                    zero.next = null;
                } else {
                    zero.next = temp;
                }

                zero = temp;
                temp = temp.next;
                sum = 0;
            }
        }

        return head;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);

        marging_nodes obj = new marging_nodes();

        ListNode result = obj.mergeNodes(head);

        obj.printList(result);
    }
}