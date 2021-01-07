package stack_linked_list;

public class stack_linked_list_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_linked_list a=new stack_linked_list();
		System.out.println(a.size());
		a.addFirst(9);
		a.addFirst(5);
		a.addFirst(4);
		a.addFirst(2);
		a.addFirst(8);
		System.out.println(a.size());
		System.out.println(a.removeFirst());
		System.out.println(a.removeFirst());
		System.out.println(a.removeFirst());
		System.out.println(a.removeFirst());
		System.out.println(a.size());
		System.out.println(a.removeFirst());
		System.out.println(a.size());
	}
}
