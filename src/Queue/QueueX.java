package Queue;

class QueueX {
	private int maxSize;
	private int front;
	private int rear;
	private int[] queueArray;
	private int nItems;
	
	//implementing constructor to initialize queue
	public QueueX(int s) {
		rear=-1; // queue is empty
		front=0;
		maxSize=s;
		queueArray=new int[maxSize];
		nItems=0;
	}
	//is queue full
	public boolean isFull() {
		return (rear==(maxSize-1));
	}
	//is queue empty
	public boolean isEmpty() {
		return (rear==0);
	}
	//insert 
	public void insert(int j) {
		if(isFull()) {
			System.out.println("queue is full...");
		}else {
		queueArray[++rear]=j;
		nItems++;
		}
	}
	//remove
	public int remove() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return 99;
		
		}else {
			nItems--;
			return queueArray[++front];
		}
	}
	
	
	
//end
}
