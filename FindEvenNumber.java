package One;

public class FindEvenNumber {
  public static void main(String[] args) {
	  int arr1[]= {12,121,1222,12323,12};
	  
	  System.out.println(findEvenDigit(arr1));
	  System.out.println(findDigit(0));
	  
  }
	/*
	 * static int findEvenDigit(int arr[]) { int index; int temp=0; int count=0; int
	 * even=0; int odd=0; for(int i=0;i<arr.length;i++) {
	 * 
	 * index=arr[i]; while(index>0) { count++; index=index/10;
	 * 
	 * } if(count%2==0) { even++; }else { odd++; } }
	 * 
	 * return even; }
	 */
  
  static int findEvenDigit(int arr[]) {
	  int count=0;
	  for(int num:arr) {
		  if(even(num)) {
			  count++;
		  }
	  }
	  return count;
  }
  
  static boolean even(int num) {
	  int findEvenNumber=findDigit(num);
	  return findEvenNumber%2==0;
	  
  }
  
  static int findDigit(int num) {
	  if(num<0) {
		  num=num * -1;
	  }
	  
	  if (num==0) {
		  return 1;
	  }
	  int count=0;
	  while(num>0) {
		  count++;
		  num=num/10;
	  }
	  return count;
  }
}
