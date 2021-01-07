package stack_linked_list;



public class node {
	public node next;
	public int element;
	public node(node n,int e) {
		next =n;
		element=e;
	}
	public node getNext() {
		return next;
	}
	public int getelement() {
		return element;
	}
	public void setNext(node n) {
		next=n;
	}
}
