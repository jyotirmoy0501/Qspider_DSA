public class LinkedListget {

    static class SinglyLinkedList {

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head;
        Node tail;
        int size;

        public void insertLast(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            size++;
        }

        public int get(int index) {

            if (index < 0 || index >= size) {
                System.out.println("Invalid Index");
                return -1;
            }

            Node temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        public void display() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        list.display();

        System.out.println("get(0) = " + list.get(0));
        System.out.println("get(3) = " + list.get(3));
        System.out.println("get(4) = " + list.get(4));
    }
}