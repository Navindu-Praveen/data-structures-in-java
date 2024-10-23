package LinkDataStr;

class Link{
	public int iData; //data item
	public Link next; //reference to next link in list
	
	public Link(int item) {
		iData=item;
	}
	
	public void displayLink() {
		System.out.println(iData);
	}
	
}
class LinkedList{
	public Link first; //reference to first link on list
	
	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int item) {
		Link newLink = new Link(item);
		newLink.next=first;
		first = newLink;
	}
	public void displayLink() {
		Link current = first;
		
		while(current != null) {
			current.displayLink();
			current=current.next;
		}
	}
	public void find(int key) {
		Link current = first;
		
		while(current!=null) {
			if(current.iData== key) {
				return true;
			}else {
				current=current.next;
			}
		}
		return false;
	}
	public void insert() {
		
	}
	public void deleteFirst() {
		
	}
//end 
}

public class LinkX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
