package Queue;

class QueueX{
	private int rear;
	private int front;
	private int maxSize;
	private int nItems;
	private int[] queueArray;
	
	public QueueX(int s) {
		front= 0;
		rear=-1;
		maxSize=s;
		nItems=0;
		queueArray=new int[maxSize];
	}
	
	
	//if queue is full
	public boolean isFull() {
		return (rear==(maxSize-1));
	}
	//if queue is empty
	public boolean isEmpty() {
		return (nItems==0);
	}
	//insert
	public void insert(int j) {
		if(isFull()) {
			System.out.println("Queue is full...");
		}else {
			queueArray[++rear]=j;
			nItems++;
		}
	}
	//remove
	public int remove() {
		if(isEmpty()) {
			System.out.println("queue is empty...");
			return -99;
		}else {
			nItems--;
			return queueArray[++front];
		}
	}
	//peek
	public int peek() {
		if(isEmpty()) {
			System.out.println("queue is empty...");
			return -99;			
		}else {
			return queueArray[front];
		}
	}
	
	
	//end
}