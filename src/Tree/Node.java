package Tree;

class Node {
    public int iData;
    public Node leftChild;  // Should be Node, not int
    public Node rightChild; // Should be Node, not int
    public double dData;

    public void displayNode() {
        System.out.print("{");
        System.out.print(iData);
        System.out.print(",");
        System.out.print(dData);
        System.out.print("}");
    }
}

class Tree {
    private Node root; // First node of tree

    public Tree() {
        root = null;
    }

    // Insert method
    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;

        if (root == null) { // No node in root
            root = newNode;
        } else { // Root occupied
            Node current = root; // Start at root
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    // Go left
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    // Go right
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Find method
    public Node find(int key) {
        Node current = root; // Start at root
        while (current != null) {
            if (key == current.iData) {
                return current; // Found it
            } else if (key < current.iData) {
                current = current.leftChild; // Go left
            } else {
                current = current.rightChild; // Go right
            }
        }
        return null; // Didn't find it
    }

    // Delete method (not fully implemented yet)
    public boolean delete(int id) {
        // Delete node logic goes here (handle 3 cases)
        return false;
    }
}
