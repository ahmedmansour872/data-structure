package sircular_linked_list;

import linked_list.node;

public class sircular_linked_list {
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
		return tail.getNext().getelement();
	}
	public int last() {
		if(isempty())
		return -1;
		else
		return tail.getelement();
	}
	public void addFirst(int e) {
		if(size==0) {
		tail=new node(null,e);
		tail.setNext(tail);
	}else {
		node newest=new node(tail.getNext(),e);
	    tail.setNext(newest);
	}
		size++;
	}
	public void addLast(int e) {
		addFirst(e);
		tail.getNext();
	}
	public int removeFrist() {
		if(isempty())
		return -1;
	    node head =tail.getNext();	
		if(head==tail)
	    tail=null;
		else
		tail.setNext(head.getNext());
		size--;
		return head.getelement();
	}
}
