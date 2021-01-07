package queue_linked_list;

public class queue_linked_list {
public int size=0;
public node head=null;
public node tail=null;
public boolean isEmpty() {
	if(size==0)
	return true;
	else 
	return false;
}
public int size() {
	return size;
}
public int first() {
	if(isEmpty())
	return -1;
	else
	return head.getelement();
}
public int last() {
	if(isEmpty())
	return -1;
	else
	return tail.getelement();
}
public void addFirst(int e) {
	head=new node(head,e);
	if(isEmpty())
	tail=head;
	size++;
}
public int removeFirst() {
	int answer=head.getelement();
	if(isEmpty())
	return -1;
	head=head.getNext();
	size--;
	if(size==0)
	tail=null;
	return answer;
}}