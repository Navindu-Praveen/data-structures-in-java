package stackP;

class StackIm{
	private int top;
	private int maxSize;
	private double[] stackArray;
	
	//constructor to initialize stack
	public StackIm(int s) {
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
	
	//push
	public void push(double j) {
		if (isFull()) {
			System.out.println("stack is full...");
		} else {
			stackArray[++top]=j;
		}
	}
	
	//pop
	public double pop() {
		if (isEmpty()) {
			System.out.println("stack is empty...");
			return -99;
		}else {
		return	stackArray[top--];
		}
	}
	//peek
	public double peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return -99;
		}else {
			return stackArray[top];
		}
	}
}

public class StackX{
	public static void main(String[] args) {
		
		StackIm stack1 = new StackIm(5);
		
		//push some values to stack
		stack1.push(10.0);
		stack1.push(20.0);
		stack1.push(30.0);
		
		// Peek the top value without popping
	    System.out.println("Peek: " +stack1.peek());
	}	
}
