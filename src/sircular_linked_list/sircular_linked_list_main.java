package sircular_linked_list;

public class sircular_linked_list_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sircular_linked_list a=new sircular_linked_list();
		System.out.println(a.size());
		a.addFirst(9);
		a.addFirst(10);
		a.addFirst(5);
		a.addLast(6);
		System.out.println(a.size());
		System.out.println(a.removeFrist());
		System.out.println(a.size());
		System.out.println(a.removeFrist());
		System.out.println(a.size());
		System.out.println(a.removeFrist());
		System.out.println(a.size());
		System.out.println(a.removeFrist());
		System.out.println(a.size());
		System.out.println(a.removeFrist());
	}

}
