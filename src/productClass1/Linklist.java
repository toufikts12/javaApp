package productClass1;

public class Linklist {

private  SlistNode head;

public Linklist() {
	 head=null;
}

//insert data
public void InsertData(int d) {

	SlistNode newNode = new SlistNode(d);

	if (head == null) {
		head = newNode;
		System.out.println("node is created -> "+head.getData());
		return;
	}
	SlistNode iter = head;
	while (iter.getNext() != null) {
		iter = iter.getNext();
	}
	iter.setNext(newNode);
	System.out.println("Data is added -> "+newNode.getData());
	return;
}

//toString

@Override
public String toString() {
	String str = new String();
	SlistNode  iter ;
	for(iter = head ; iter !=null ; iter=iter.getNext()) {
		str = str +"   "+ iter.getData();
	}
	return str;
}

//insert first
public void insertFirst(int d) {
	SlistNode newNode = new SlistNode(d);

	if(head == null) {
		head = newNode;
		return;
	}
	newNode.setNext(head);  							
	head = newNode;													
	System.out.println("New node is created  "+ head.getData());
	return;
}

// delete first
public int deleteFirst() {
	int d = -999;
	if(head == null) {
		return d;
	}
	SlistNode deletable = head;
	d=head.getData();
	head = head.getNext();
	deletable = null;

	return d;

}
// delete last
public int deleteLast() {
	SlistNode deletable=null;
	SlistNode iter = head;
	int d=-9;
	if(head == null) {
		System.out.println("List is null please fill that....");
		return d;
	}
	if(iter.getNext()==null) {
		d= iter.getData();
		head=null;

		return d;
	}
	while( iter.getNext().getNext()!= null) {
		iter = iter.getNext();
	}

	d = iter.getData();

	System.out.println(d);

	iter.setNext(null);

	return d;
}

//reverse the ll
public void ReverseLL() {
	SlistNode curr, prev , next;

	prev=null;
	curr = head;
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr=next;
		}
		head = prev;
		return;
}


	
}
