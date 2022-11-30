package One;

import java.util.Scanner;

public class GuessNo {

	public static void main(String[] args) {
		System.out.println(guessNumber(10));

	}
	public static int guessNumber(int n) {

	    int i=1,j=n;
	    while(i<=j)
	    {
	        int mid=i+(j-i)/2;
	        
	        if(guess(mid)==0)
	            return mid;
	        else if(guess(mid)==-1) {
	            j=mid-1;
	            System.out.println("Number is less than i picked");
	        }
	        else if(guess(mid)==1)
	            i=mid+1;
	    }
	        
	    return 0;
	}
	public static  int guess(int mid) {
		Scanner sc=new Scanner(System.in); 
			
				System.out.println("Enter the Number");
				mid=sc.nextInt();
					return mid;
	}
	
}
