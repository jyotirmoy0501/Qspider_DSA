class Nodes {
    int data;
    Node next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Insert at last
    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Delete first node
    public boolean deleteFirst() {

        if (isEmpty()) {
            System.out.println("Nothing to delete");
            return false;
        }

        else if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return true;
        }

        else {
            head = head.next;
            size--;
            return true;
        }
    }

    // Display list
    public void display() {

        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Display size
    public void displaySize() {
        System.out.println("Size = " + size);
    }
}

public class deleteLinkedlist {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        System.out.println("Original List:");
        list.display();
        list.displaySize();

        list.deleteFirst();

        System.out.println("\nAfter deleteFirst():");
        list.display();
        list.displaySize();
    }
}