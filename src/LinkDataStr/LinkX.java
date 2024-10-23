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
	public void displayList() {
		Link current = first;
		
		while(current != null) {
			current.displayLink();
			current=current.next;
		}
	}
	public boolean find(int key) {
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
	public void insert(int key,int item) {
		Link current=first;
		
		
		while(current!=null) {
			if(current.iData==key) {
				Link newLink = new Link(item);
				newLink.next= current.next;
				current.next=newLink;
			}	else {
				System.out.println("key not found!");
			}
		}	
	}
	public int deleteFirst() {
		Link temp = first;
		first= first.next;
		return temp.iData;	
	}
	public void delete(int key) {
		Link previous=first;
		Link current=first;
		
		while(current!=null) {
			if(current.iData==key) {
				previous.next=current.next;
			}else {
				previous=current;
				current=current.next;
				
			}
		}
			
		}
	//end 
	}
public class LinkX {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		
		
		
//		list.deleteFirst();
		list.delete(10);
		list.displayList();

	}

}
