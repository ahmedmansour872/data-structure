 
package queuelink; 
public class linklist {
       int x;
  NODE head =null;
  NODE tail=null;
  int size=0;
  
    public boolean isEmpty(){  return (size==0);
      }
    
    public int  first( ){
           if(isEmpty())return 0;
    return head.getelement(); }
      public int  size( ){
             if(isEmpty())return 0;
    return size ; }
      void addf(int x){
             head=new NODE(x,head);
       if(size==0)
            tail=head;  
      
       size++;
      }
      void addl(int x){
       NODE newnode=new NODE(x,null);
       if (isEmpty())
              head=newnode;
       else
              tail.setnext(newnode);
       tail=newnode;
       size++;
      }
      int remove(){
      if(isEmpty())
      return 0;
     int y =  head.getelement();
     head=head.getnext();
      size--;
      if(size==0)
             tail =null;
      return y;
      }
}
