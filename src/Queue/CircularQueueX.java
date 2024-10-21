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
			
		}
	}
	//remove
	//peek

	
//end
}
