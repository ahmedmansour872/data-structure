package queue_linked_list;

public class queue_linked_list_mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_linked_list a=new queue_linked_list();
		System.out.println(a.size());
		a.addFirst(8);
		a.addFirst(9);
		a.addFirst(5);
		a.addFirst(4);
		a.addFirst(7);
		System.out.println(a.size());
		System.out.println(a.removeFirst());
		System.out.println(a.removeFirst());
		System.out.println(a.removeFirst());
		System.out.println(a.size());
		System.out.println(a.removeFirst());
		System.out.println(a.removeFirst());
		System.out.println(a.size());
	}
}
