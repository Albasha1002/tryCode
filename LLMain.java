package One;

public class LLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LL l=new LL();
		
		l.insertionHeadNode(5);
		l.insertionHeadNode(4);
		l.insertionHeadNode(3);
		;
		
		
		
		l.insertionTailNode(6);
		l.insertionTailNode(7);
		l.insertionTailNode(8);
       	
       
       	System.out.println("index "+l.getIndex(2));
       	
       	
     
   
      	
      	
      	System.out.println("find index "+l.find(8));
      	System.out.println("after");
      	l.display();
       
       	       
	}

}
