package Tree;

class Node {
    public int iData;        // Data item (key)
    public double dData;     // Additional data item
    public Node leftChild;   // Reference to left child
    public Node rightChild;  // Reference to right child

    // Method to display the node
    public void displayNode() {
        System.out.print("{");
        System.out.print(iData);
        System.out.print(",");
        System.out.print(dData);
        System.out.print("}");
    }
}

class Tree {
    private Node root; // First node of the tree (root)

    // Constructor to initialize an empty tree
    public Tree() {
        root = null;
    }

    // Insert a node into the tree
    public void insert(int id, double dd) {
        Node newNode = new Node(); // Create new node
        newNode.iData = id;        // Set data
        newNode.dData = dd;

        if (root == null) { // If tree is empty, set root to new node
            root = newNode;
        } else { // Otherwise, find the correct place to insert
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) { // Go left
                    current = current.leftChild;
                    if (current == null) { // If no left child, insert here
                        parent.leftChild = newNode;
                        return;
                    }
                } else { // Go right
                    current = current.rightChild;
                    if (current == null) { // If no right child, insert here
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Find a node with a specific key (id)
    public Node find(int key) {
        Node current = root; // Start at the root
        while (current != null) {
            if (key == current.iData) { // Key found
                return current;
            } else if (key < current.iData) { // Go left
                current = current.leftChild;
            } else { // Go right
                current = current.rightChild;
            }
        }
        return null; // Key not found
    }

    // Delete a node with a specific key
    public boolean delete(int key) {
        Node current = root; // Start at the root
        Node parent = root;
        boolean isLeftChild = true;

        // Search for the node to delete
        while (current.iData != key) {
            parent = current;
            if (key < current.iData) { // Go left
                isLeftChild = true;
                current = current.leftChild;
            } else { // Go right
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) { // Node not found
                return false;
            }
        }

        // Node with no children (leaf)
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null; // If the root is to be deleted
            } else if (isLeftChild) {
                parent.leftChild = null; // Disconnect from parent
            } else {
                parent.rightChild = null;
            }
        }

        // Node with only one child (right child)
        else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }

        // Node with only one child (left child)
        else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        }

        // Node with two children
        else {
            Node successor = getSuccessor(current); // Get the successor node

            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild; // Attach left child of the deleted node to successor
        }

        return true; // Deletion successful
    }

    // Method to get the in-order successor for deletion
    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild; // Go to the right child

        // Find the leftmost node of the right subtree
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        // Successor's right child is now successorParent's left child
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }

        return successor;
    }

    // In-order depth-first traversal (Left, Root, Right)
    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);  // Traverse left subtree
            localRoot.displayNode();       // Visit node
            inOrder(localRoot.rightChild); // Traverse right subtree
        }
    }

    // Pre-order depth-first traversal (Root, Left, Right)
    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            localRoot.displayNode();       // Visit node
            preOrder(localRoot.leftChild); // Traverse left subtree
            preOrder(localRoot.rightChild);// Traverse right subtree
        }
    }

    // Post-order depth-first traversal (Left, Right, Root)
    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);  // Traverse left subtree
            postOrder(localRoot.rightChild); // Traverse right subtree
            localRoot.displayNode();         // Visit node
        }
    }

    // Get the root of the tree
    public Node getRoot() {
        return root;
    }
}

public class TreeX {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // Insert nodes
        tree.insert(50, 1.5);
        tree.insert(25, 1.2);
        tree.insert(75, 1.7);
        tree.insert(12, 1.5);
        tree.insert(37, 1.2);
        tree.insert(43, 1.7);
        tree.insert(30, 1.5);
        tree.insert(33, 1.2);
        tree.insert(87, 1.7);
        tree.insert(93, 1.5);
        tree.insert(97, 1.5);

        // Display tree (in-order)
        System.out.println("In-order traversal:");
        tree.inOrder(tree.getRoot());
        System.out.println();

        // Delete node with two children
        tree.delete(25);
        System.out.println("After deleting 25:");
        tree.inOrder(tree.getRoot());
        System.out.println();

        // Pre-order traversal
        System.out.println("Pre-order traversal:");
        tree.preOrder(tree.getRoot());
        System.out.println();

        // Post-order traversal
        System.out.println("Post-order traversal:");
        tree.postOrder(tree.getRoot());
        System.out.println();
    }
}
