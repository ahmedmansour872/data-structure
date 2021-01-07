package stack_linked_list;

public class stack_linked_list {
public node head=null; 
public node tail=null;
public int size =0;
public int top =-1;

public int size() {
	return size;
	}
public int top() {
	return top;
}
public boolean isEmpty() {
	if(size==0)
	return true;
	else 
	return false;
}
public int first() {
	return head.getelement(); 
}
public int last() {
	return tail.getelement(); 
}
/*public void addLast(int e) {
	node newest=new node (null,e);
	if(isEmpty())
	head=newest;
	else 
	tail.setNext(newest);
	tail=newest;
	size++;
	}
*/
public void addFirst(int e) {
	head=new node(head,e);
	if(isEmpty())
	tail=head; 
	size++;	
}
public int removeFirst() {
	if(isEmpty())
	return 0;
	int answer=head.getelement();
	head=head.getNext();
	size--;
	return answer;
}

}