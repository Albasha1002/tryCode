package One;

public class AddTwoNumberLinkedList {
                  static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList head1=new LinkedList();
		LinkedList head2=new LinkedList();
		
		head1.insertDataHead(1);
		head1.insertDataHead(2);
		head1.insertDataHead(3);
		
		head2.insertDataHead(9);
		head2.insertDataHead(6);
		head2.insertDataHead(5);
		head2.insertDataHead(9);
		
		
   Node ob= dwoNumber(head1.head,head2.head);
   printLt(ob);
   reverseLinkedList(ob);
	}
	
	
	static Node dwoNumber(Node head1, Node head2) {
		
		Node current=head1;
		Node current1=head2;
		
		int carry=0;
		int value=0;
		LinkedList ob=new LinkedList();
		
		while(current!=null && current1!=null) {
			int sum=0;
			
			sum+=current.data+current1.data+carry;
			System.out.println(sum);
			if(sum>9) {
				carry=1;
			}else {
				carry=0;
			}
current=current.next;
			current1=current1.next;
			value=sum%10;
			System.out.println(value+"value");
			ob.insertDataTail(value);
			
			
			
		}

		if(current!=null) {
			ob.insertDataTail(current.data);
		}else {
			ob.insertDataTail(current1.data);
		}
		System.out.println(ob.head.data+"insert data");
		
		return ob.head;
	}
	
	static void printLt(Node head) {
		Node temp=head;
		Node last=null;
		
		while(temp!=null) {
			System.out.println(temp.data);
			last=temp;
			temp=temp.next;
		}
		
		
		
}
	
	static void reverseLinkedList(Node head) {
		Node prev=null;
	    Node current =head;
	    Node next=head.next;
	    
	 while(current!=null){
		 System.out.println(current.data);
		  next=current.next;
		  current.next=prev;
		  prev=current;
		  current=next;
		  
	  }
	 while(prev!=null) {
		 System.out.println(prev.data+"prev");
		 prev=prev.next;
	 }
	}
}
