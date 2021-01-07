package queue;

public class queue_main {

	public static void main(String[] args) {
		queue a=new queue ();
		System.out.println(a.first());
		a.enqueue(5);

		a.enqueue(6);
		
		System.out.println(a.first());
	}

}
