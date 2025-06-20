public class basic {
    // Define the Node class
    public static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node;only nodecan store next address becase it is object datatype

        // Constructor to initialize a node
        Node(int data) {
            this.data = data;
            this.next = null; // Next is initially null
        }
    }

    public static void main(String[] args) {
        // Create nodes
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(10);

        // Link the nodes to form a linked list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Print the linked list
        printList(a);
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            System.out.print(current.next + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
