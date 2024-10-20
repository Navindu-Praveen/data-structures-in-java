package stackP;

class StackX{
	private int top;
	private int maxSize;
	private double[] stackArray;
	
	//constructor to initialize stack
	public StackX(int s) {
		top=-1;
		maxSize=s;
		stackArray=new double[maxSize];
	}
	
	//check stack is full
	public boolean isFull() {
		return (top==top-1);
	}
	//check stack is empty
	public boolean isEmpty() {
		return (top==-1);
	}
	
	
}
