package stack;

public class stack_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack<Integer> a=new stack<Integer>(10);
		
		a.push(5);
		a.push(5);
		System.out.println(a.top);
		System.out .println(a.pop());
		System.out.println(a.isEmpty());
	}

}
