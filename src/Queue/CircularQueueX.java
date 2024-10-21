package Queue;

class  CircularQueueX {
	private int front;
	private int rear;
	private int maxSize;
	private int nItems;
	private int[] queueArray;
	
	
	
	public CircularQueueX(int s) {
		rear=-1;
		front=0;
		maxSize=s;
		nItems=0;
		queueArray=new int[maxSize];
	}
	
	//isfull
	public boolean isFull() {
		return (nItems==maxSize); 
	}
	//isEmpty
	public boolean isEmpty() {
		return (nItems==0);
		
	}
	//insert
	public void insert(int j) {
		if(isFull()) {
			System.out.println("circuler queue is full ");
		}else {
			//if the queue is not full and have to reassign rear
			if(rear==(maxSize-1)) {
				rear=-1;
			}
			queueArray[++rear]=j;
			nItems++;
		}
	}
	//remove
	public int remove() {
		if(isEmpty()) {
			System.out.println("circuler queue is empty");
			return -99;
		}else {
			int temp=queueArray[front++];
			if(front==maxSize) {
				front=0;
			}
			nItems--;
			return temp;
		}
	}
	//peek
	public int peek() {
		if(isEmpty()) {
			System.out.println("circuler queue is empty");
			return -99;
		}else {
			return queueArray[front];
		}
	}
	
//end
}
