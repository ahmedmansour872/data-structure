 
package queuelink; 
public class Queuelink { 
       public static void main(String[] args) {
             QUELINKLIST que=new QUELINKLIST();
             que.enqueue(5);
             que.enqueue(6);
             que.enqueue(8);
               System.out.println( que.isEmpty());
              System.out.println( que.dequeue());
                  
                       System.out.println( que.size());
       }
       
}
