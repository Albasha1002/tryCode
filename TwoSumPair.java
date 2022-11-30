package One;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List l=new ArrayList<Integer>();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(5);
      l.add(4)
;      System.out.println(l.get(0)+"psvm");
      System.out.println((twoSumPair(l, 5)));
	
	}
	
	static ArrayList<Integer> twoSumPair( List<Integer> a,int  b) {
		int value=0;
		
		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int i=0;i<a.size();i++) {
			
			if(m.get(b-a.get(i))==null)
			{
				if(m.get(a.get(i))==null)
					m.put(a.get(i),i);
				
			}else {
				
				output.add(1+m.get(b-a.get(i)));
				output.add(i+1);
				return output;
			}
			
		}
		return output;
		
	}

}
