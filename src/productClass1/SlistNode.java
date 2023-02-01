package productClass1;

final class SlistNode {
 
	 private int data;
	 private SlistNode next; 				 

  
	 public SlistNode() {
		 data =0;
		 next = null;
	 }
	 public SlistNode(int d) {
		 data =d;
		 next = null;
	 }

	 public void setData(int d	) {
		 data=d;
	 }
	 public int getData() {

		 return data;

	 }
	 public void setNext(SlistNode n) {
		 next=n;
	 }
	 public SlistNode getNext() {
		 return next;
	 }





 


	
}
