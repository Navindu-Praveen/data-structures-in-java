package LinkDataStr;

class LinkX {
	private int iData;
	private LinkX next;
	
	
	public LinkX(int id) {
		iData=id;
		next=null;
	}
	
	public void displayLink() {
		System.out.println(iData); //display data item
	}
	
	

}
