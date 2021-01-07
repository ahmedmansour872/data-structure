package linked_list_queue;

public class queue implements QUEU {
	linkedList list =new linkedList();
	 
	 
     public boolean isEmpty() {
         return   list.isEmpty();
     }

      
     public void enqueue(int e) {
            list.addl(e);
     }

      
     public int first() {
          return  list.first();
     }
     
     public int dequeue() {
            return list.remove();
     }

     
     public int size() {
   return list.size();

     }
     
}
