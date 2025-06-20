public class insertatend {

    // Node class definition
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize a node
        Node(int data) {
            this.data = data;
            this.next = null; // Initialize next as null
        }
    }

    // LinkedList class definition
    public static class LinkedList {
        Node head = null; // Start with an empty list
        Node tail = null; // Track the tail of the list

        // Method to insert a node at the end
        void insertAtEnd(int val) {
            Node temp = new Node(val); // Create a new node with the given value
            if (head == null) { // If the list is empty
                head = temp; // The new node becomes the head
                tail = temp; // The new node also becomes the tail
            } else {
                tail.next = temp; // Link the current tail to the new node
                tail = temp; // Update the tail to the new node
            }
        }

        // Method to display the linked list
        void display() {
            Node current = head; // Start at the head
            while (current != null) {
                System.out.print(current.data + " -> "); // Print each node's data
                current = current.next; // Move to the next node
            }
            System.out.println("null"); // Indicate the end of the list
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements at the end
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);

        // Display the linked list
        System.out.println("Linked List:");
        list.display();
    }
}
