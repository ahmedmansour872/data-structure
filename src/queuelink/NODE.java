 
package queuelink;
 
public class NODE   {
       private  int  element ;
       private  NODE  next;
   public NODE (int X, NODE Y){
       element=X;
      next=Y; }
   
   public int   getelement(){
    return element;
    }
  public NODE getnext(){
    return next;
    }
  void setnext(NODE e){
     next=e;
    }
}
