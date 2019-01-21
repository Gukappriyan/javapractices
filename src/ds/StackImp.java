package ds;

public class StackImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack();
		st.push(10);
		st.push(10);
		st.push(10);
		System.out.println(st.peek());
		st.push(10);
		st.push(10);
		//st.show();
		st.push(10);
		st.push(20);
		st.pop();
		st.show();

	}

}
