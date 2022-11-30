package One;

import java.util.Scanner;

public class DynamicArray {
	
	private static final int initialCapacity =16;
	private int arr[];
	private int size;
	private int capacity;
	
	DynamicArray(){
		size=0;
		arr=new int [initialCapacity];
		capacity=initialCapacity;
	}
	
	public void add1(int val) {
		if(size==capacity) {
			expandCapacity();
		}
		arr[size++]=val;
	}
	private void expandCapacity() {
		capacity*=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	
	
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val,pos;
		DynamicArray list=new DynamicArray();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n ------Listenu ----");
			System.out.println("1.Insert at End|n");
			System.out.println("2. Display the List |n");
			System.out.println("3. Insert at specificied psition");
			System.out.println("4. Delete from specified position");
			System.out.println("5. Exit");
			System.out.println("ENter the Number");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.print("Enter the data: ");
				   val=sc.nextInt();
				   list.add1(val);
				   break;
			case 2:System.out.print("Data Displyed ");
				   list.display();
				   break;
			}
			
		}
		

	}



	
}
