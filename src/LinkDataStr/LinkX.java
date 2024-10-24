package LinkDataStr;

// Link class representing a node in the linked list
class Link {
    public int iData; // Data item
    public Link next; // Reference to the next node (Link) in the list

    // Constructor to initialize a node with a data item
    public Link(int item) {
        iData = item;
    }

    // Method to display the data in this node
    public void displayLink() {
        System.out.println(iData);
    }
}

// LinkedList class representing a singly linked list
class LinkedList {
    public Link first; // Reference to the first node in the list

    // Constructor to initialize the linked list
    public LinkedList() {
        first = null; // List starts as empty (no nodes)
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return (first == null); // If first is null, the list is empty
    }

    // Method to insert a new node at the beginning of the list
    public void insertFirst(int item) {
        Link newLink = new Link(item); // Create a new node with the given data
        newLink.next = first; // New node points to the current first node
        first = newLink; // The new node becomes the first node in the list
    }

    // Method to display all the nodes in the list
    public void displayList() {
        Link current = first; // Start at the first node

        // Traverse the list and display each node's data
        while (current != null) {
            current.displayLink(); // Display the current node's data
            current = current.next; // Move to the next node
        }
    }

    // Method to search for a node with a specific key (value)
    public boolean find(int key) {
        Link current = first; // Start at the first node

        // Traverse the list looking for the key
        while (current != null) {
            if (current.iData == key) { // If key is found, return true
                return true;
            } else {
                current = current.next; // Move to the next node
            }
        }
        return false; // Key not found, return false
    }

    // Method to insert a new node after a specific key
    public void insert(int key, int item) {
        Link current = first; // Start at the first node

        // Traverse the list to find the node with the given key
        while (current != null) {
            if (current.iData == key) { // If key is found
                Link newLink = new Link(item); // Create a new node with the given item
                newLink.next = current.next; // New node points to the current node's next
                current.next = newLink; // Current node now points to the new node
                return; // Exit after inserting
            }
            current = current.next; // Move to the next node
        }
        // If key not found after traversal, print a message
        System.out.println("Key not found!");
    }

    // Method to delete the first node in the list
    public int deleteFirst() {
        Link temp = first; // Store the reference to the first node
        first = first.next; // Move the first to the next node
        return temp.iData; // Return the data of the deleted node
    }

    // Method to delete a node with a specific key
    public void delete(int key) {
        Link previous = first; // Reference to keep track of the previous node
        Link current = first; // Start at the first node

        // Traverse the list to find the node with the given key
        while (current != null) {
            if (current.iData == key) { // If key is found
                if (current == first) { // Special case: deleting the first node
                    first = first.next; // Move the first to the next node
                } else {
                    previous.next = current.next; // Bypass the current node
                }
                return; // Exit after deleting
            } else {
                previous = current; // Move the previous node forward
                current = current.next; // Move the current node forward
            }
        }
        // If key not found after traversal, print a message
        System.out.println("Key not found!");
    }
}

// Main class to test the LinkedList
public class LinkX {

    public static void main(String[] args) {

        // Create a new linked list
        LinkedList list = new LinkedList();

        // Insert elements into the list
        list.insertFirst(10); // Insert 10 at the beginning
        list.insertFirst(20); // Insert 20 at the beginning
        list.insertFirst(30); // Insert 30 at the beginning

        // Delete the node with value 10 from the list
        list.delete(10);

        // Display the list after deletion
        list.displayList();
    }
}
