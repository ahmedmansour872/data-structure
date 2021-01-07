package double_linked_list;

public class node {
	public node next;
	public node prev;
	public int element;
	public node(node n,node p,int e) {
		next =n;
		prev=p;
		element=e;
	}
	public node getNext() {
		return next;
	}
	public node getprev() {
		return prev;
	}
	public int getelement() {
		return element;
	}
	public void setNext(node n) {
		next=n;
	}
	public void setprev(node p) {
		prev=p;
	}
}


/*
 * package text;

public class node {
	public node next;
	public node prev;
	public int element ;
	public node(node n ,node v, int e ){
		next=n;
		prev=v;
		element=e;
	}
	
	public int getElement() {
		return element;
	}

	public node getNext() {
		return next;
	}
	
	public node getprev() {
		return next;
	}
	
	public void setNext(node n) {
	next=n;
	}
	
	public void setprev(node n) {
		prev=n;
		}
}

 */
