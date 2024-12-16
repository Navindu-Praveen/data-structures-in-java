package Queue;
import Queue.CircularQueueX;

public class CircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method ubst
		
		CircularQueueX cQueue = new CircularQueueX(6);
		
		cQueue.insert(10);
		cQueue.insert(20);
		cQueue.insert(30);
		cQueue.insert(40);
		cQueue.insert(50);
		cQueue.insert(60);
		
		System.out.println("peek front is : " +cQueue.peek());
		
		System.out.println("remove item is : " +cQueue.remove());
		System.out.println("peek front is : " +cQueue.peek());
		System.out.println("remove item is : " +cQueue.remove());
		System.out.println("remove item is : " +cQueue.remove());
		System.out.println("remove item is : " +cQueue.remove());
		System.out.println("peek front is : " +cQueue.peek());
		System.out.println("remove item is : " +cQueue.remove());
		cQueue.insert(40);
		cQueue.insert(50);
		cQueue.insert(60);
		System.out.println("peek front is : " +cQueue.peek());

	}

}
