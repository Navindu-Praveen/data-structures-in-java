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
	
	
	
	
	
//end
}
