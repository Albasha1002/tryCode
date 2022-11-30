package One;

import One.LL.Node;

public class CL {
//Doubly Linked List not **CLL**
	Node head;
	Node tail;
	
	class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val=val;
		}
		public Node(int val, Node next) {
			this.val=val;
			this.next=null;
		}
		public Node(int val, Node next,Node prev) {
			this.val=val;
			this.next=next;
			this.prev=prev;
		}
		
	}
	
	
	public CL() {
		this.head=head;
		this.tail=tail;
		
	}
	
	public void insertionFirst(int val) {
		Node node=new Node(val);
		
		
       node.next=head;
       node.prev=null;
       if(head!=null) {
    	   head.prev=node;
       }
      
       head=node;

		}
	public void insertLast(int val) {
		Node node=new Node(val);
		if(head==null) {
			head=node;
			node.prev=null;
			return;
		}else {
			    Node current=head;
				while(current.next!=null) {
					current=current.next;
				}
				
				current.next=node;
				node.next=null;
				node.prev=current;
		}
	}
	
	public void LastInsertion(int val) {
		Node node=new Node(val);
		if(head==null) {
			head.prev=node;
			head=node;
		}
		
		Node last=head;
		
		while(last.next!=null) {
			last=last.next;
		}
		
		last.next=node;
		node.next=null;
		node.prev=last;
		last=node;
		
		
		
	}
	
	public void displayPrint() {
		Node current = head;
		Node last=null;
		while(current!=null) {
			System.out.println(current.val);
			last=current;
			current=current.next;
		}
		
		System.out.println("reverse");
		
		while(last!=null) {
			System.out.print(last.val);
			last=last.prev;
		}
	}
	
	public Node find(int val) {
		
		Node current=head;
		
		while(current!=null) {
			if(current.val==val) {
				return current;
			}
			current=current.next;
		}
		return null;
	}
	
     public void insertafter(int val1,int val) {
	       Node p=find(val1);
	       
	       if(p==null) {
	    	   System.out.println("not exist");
	       }
	       Node node=new Node(val);
	       node.next=p.next;
	       node.prev=p;
	       p.next=node;
	       if(node.next!=null) {
	       node.next.prev=node;
	       }
	       
}
	
	

}
