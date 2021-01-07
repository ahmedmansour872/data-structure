package double_linked_list;

public class double_linked_list {
public node head;
public node tail;
public int size=0;
public double_linked_list() {
	head=new node(null,null,0);
	tail=new node(null,head,0);
	head.setNext(tail);
}
public int size() {
	return size;
}
public boolean isEmpty() {
	if(size==0)
	return true;
	else 
	return false;
}
public int first() {
	if(isEmpty())
	return 0;
	return head.getNext().getelement();
}
public int last() {
	if(isEmpty())
	return 0;
	return tail.getprev().getelement();
}
public void addBetween(node next,node prev,int e) {
	node newest=new node (next,prev,e);
	next.setprev(newest);
	prev.setNext(newest); 
	size++;	}
public void addFirst(int e) {
	addBetween(head, head.next, e);}
public void addLast(int e) {
	addBetween(tail.prev, tail, e);}
public int remove(node Node) {
node ahmed=Node.getNext();	
node rabea=Node.getprev();
ahmed.setprev(rabea);
rabea.setNext(ahmed);
size--;
return Node.getelement();}
public int removeFirst(){
	if(isEmpty())
		return 0;
	return remove(tail.getprev());}
public int removeLast(){
	if(isEmpty())
		return 0;
	return remove(head.getNext());
}
}