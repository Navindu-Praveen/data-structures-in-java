package lab1;
import java.util.Scanner;

class StackLab{
	private int maxSize;
	private int top;
	private char[] stackArray;
	
	
	public StackLab(int s ) {
		top=-1;
		maxSize=s;
		stackArray=new char[maxSize];	
	}
	
	
	//check stack is full or not
	public boolean isFull() {
		return (top==(maxSize-1));
	}
	//check stack is empty
	public boolean isEmpty() {
		return (top==-1);
	}
	//push
	public void push(char j) {
		if(isFull()) {
			System.out.println("Stack is Full..");
		}else {
		stackArray[++top]=j;
	}
}
	//pop
	public char pop() {
		if(isEmpty()) {
			System.out.println("stack is empty...");
			return 0;
		} else {
			return stackArray[top--];
		}	
	}
	//peek
	public char peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		}else {
			return stackArray[top];
		}
	}
	
	//end
	}
		
		
//main class

public class StackLab1{
	public static void main (String[] args) {
		
		StackLab stklab = new StackLab(10);
		
		stklab.push('a');
		
		
		System.out.println(stklab.peek());
		
		
		
		
	}
}