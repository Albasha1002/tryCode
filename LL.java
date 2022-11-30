package One;

public class LL {
	Node head;
	Node tail;
	int size;
		
		
	
	class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val=val;
		}
		
		public Node(int val,Node next) {
			this.val=val;
			this.next=next;
		}
	}
	
	public void insertionHeadNode(int val) {
		if(tail==null) {
			tail=head;
		}
		
		Node node=new Node(val);
		node.next=head;
		head=node;
		size++;
	
		
	}
	
	public void display() {
		Node current =head;
		
		
		while(current!=null) {
			System.out.println(current.val);
			current=current.next;
		}
		
	}
	
	public void insertionTailNode(int val) {
		if(tail==null) {
			insertionHeadNode(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
		
	}
	
	public void insert(int val, int index) {
		if(index==0) {
			insertionHeadNode(val);
			return;
		}
		if (index==size) {
			insertionTailNode(val);
			return;
		}
		
		Node current=head;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		
		Node node=new Node(val, current.next);
		current.next=node;
		size++;
		
		
	}
	
	public Node getIndex(int index) {
		Node current=head;
		for(int i=0;i<index;i++) {
			current=current.next;
		}
		return current;
	}
	
	public int deletionFirst() {
		int val=head.val;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
		
		
	}
	
	public int deleteLast() {
		if(size<=1) {
			deletionFirst();
		}
		
		
		int val=tail.val;
		Node secondLast=getIndex(size-2);
		tail=secondLast;
		tail.next=null;
		return val;
	}
	
	public int delete(int index) {
		if(index==0) {
			deletionFirst();
		}
		if((size-1)==index) {
			deleteLast();
		}
		
		Node prev=getIndex(index-1);
		int val=getIndex(index).val;
		prev.next=prev.next.next;
		
		return val;
				
	}
	
	public int find(int val) {
		Node current=head;
	while(current!=null) {
		for(int i=0;i<size;i++) {
			if(current.val==val) {
				System.out.println("finded");
				return i;
			}
			current=current.next;
		}
	}
	return -1;
	}

}
