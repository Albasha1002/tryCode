package One;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bo=paranthesis("{([])}");
		System.out.println(bo);
	}
	
	static boolean paranthesis(String param) {
		java.util.Stack<Character> st=new java.util.Stack<Character>();
		if(param.length()==0) {
			return true;
		}
		for(int i=0;i<param.length();i++) {
			char cureentParam=param.charAt(i);
			System.out.println(cureentParam);
			if(cureentParam=='{'|| cureentParam=='['||cureentParam=='(') {
				st.add(cureentParam);
			}else {
				if(st.isEmpty()) {
					return false;
				}else {
					char topElemnet=st.peek();
					if(topElemnet=='{'&&cureentParam=='}'||topElemnet=='['&&cureentParam==']'||topElemnet=='('&&cureentParam==')') {
						st.pop();
					}else {
						return false;
					}
				}
			}
			
		}
		if(st.isEmpty()) {
			return true;
		}
		return false;
	}

}
