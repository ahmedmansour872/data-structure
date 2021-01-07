package linked_list_queue;

public class Node {
	  private  int  element ;
      private  Node  next;
  public Node (int X, Node Y){
      element=X;
     next=Y; }
  
  public int   getelement(){
   return element;
   }
 public Node getnext(){
   return next;
   }
 void setnext(Node e){
    next=e;
   }
}
