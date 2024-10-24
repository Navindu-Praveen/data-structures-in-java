package Tree;

class Node {
	public int iData;
	public int leftChild;
	public int rightChild;
	public double dData;
	
	
	public void displayNode() {
		System.out.print("{");
		System.out.print(iData);
		System.out.print(",");
		System.out.print(dData);
		System.out.print("}");
	}

}

class Tree{
	private Node root; //first node of tree
	
	public Tree() {
		root =null;
	}
	public void insert(int id,double dd) {
		
	}
	public boolean delete(int id) {
		
	}
	public Node find(int key) {
		
	}
}

