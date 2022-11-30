package One;

public class WealthOfPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,2,3},{3,4,5},{1,1,1}};
		System.out.println(wealthOf(arr));
      
	}
	
	
	static int wealthOf(int accounts[][]) {
		int ans=Integer.MIN_VALUE;
		
		for(int person=0;person<accounts.length;person++) {
			int sum=0;
			for(int account=0;account<accounts[person].length;account++) {
				  System.out.println(accounts[person][account]);
				  sum+=accounts[person][account];
			}
			if(sum>ans) {
				ans=sum;
			}
		}
		
		return ans;
	}
}
