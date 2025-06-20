public class recrsive {

    // Node class definition
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize node
        Node(int data) {
            this.data = data;
            this.next = null; // Initialize next as null
        }
    }

    // Recursive method to display the linked list
    public static void display(Node head) {
        if (head == null) { // Base case: if head is null, stop recursion
            return;
        }
        System.out.print(head.data + " -> "); // Print the current node's data
        display(head.next); // Recursive call with the next node
    }

    public static void main(String[] args) {
        // Create nodes
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);

        // Link the nodes to form a linked list
        a.next = b;
        b.next = c;
        c.next = d;

        // Display the linked list
        display(a);
        System.out.println("null"); // Indicate the end of the linked list
    }
}
