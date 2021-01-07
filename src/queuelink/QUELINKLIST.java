 
package queuelink; 
public class QUELINKLIST implements QUEUE{
   linklist list =new linklist();
 
 
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
