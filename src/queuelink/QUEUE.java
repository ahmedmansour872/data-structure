 
package queuelink;
 
public interface QUEUE {
    int size();
       boolean isEmpty();
       void enqueue(int e);
       int first();
       int dequeue();
 }
