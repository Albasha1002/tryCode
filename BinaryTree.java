package One;
class Nod{
	int data;
	Nod left, right;
	
	public Nod(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
		}
}

public class BinaryTree {
	Nod root;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree ob=new BinaryTree();
		ob.root =new Nod(1);
		ob.root.left=new Nod(2);
		ob.root.right=new Nod(3);
		ob.root.left.left=new Nod(4);
		ob.root.left.right=new Nod(5);
		ob.printNode();
	}
	
	
	  void printNode() {
		
		
		java.util.Queue<Nod> ob=new java.util.LinkedList<Nod>();
		ob.add(root);
		while(!ob.isEmpty()) {
			Nod headNode=ob.poll();
			System.out.println(headNode.data);
			
			if(headNode.left!=null) {
				ob.add(headNode.left);
			}
			if(headNode.right!=null) {
				ob.add(headNode.right);
			}
		}
	}

}
