package linked_list;
public class linkedLIst {
public node head=null;
public node tail=null;
public int size=0;
public int size() {
	return size;
}
public boolean isempty() {
	if(size==0) {
	return true;
	}
	else 
	return false;
}
public int first() {
	if(isempty())
	return -1;
	else
	return head.getelement();
}
public int last() {
	if(isempty())
	return -1;
	else
	return tail.getelement();
}
public void addFirst(int e) {
	head=new node(head,e);
	if(size==0) 
	tail=head;
	size++;
}
public void addLast(int e) {
	node newest=new node(null,e);
	if(isempty())
	head=newest;
	else 
	tail.setNext(newest);
	tail=newest;
	size++;
}
public int removeFrist() {
	if(isempty())
	return -1;
    int anwser=head.getelement();
	head=head.getNext();
	size--;	
	if(size==0)
	tail=null;
	return anwser;
}
public void show () {
	node i=head;
	while(i!=null) {
		System.out.println(i.getelement());
		i=i.getNext();
	}
}
}
