package queue;

public class queue {
public final int cabacety=10;
public int first=0;
public int size=0;
public int []x=new int [cabacety];


public boolean isEmpty() {
	if(size==0)
		return true;
	else return false;
	}
public int size() {
	return size;
	}
public int first() {
	if(!isEmpty()) 
	return x[first];
	else
	return -1;
	}
public void enqueue(int e) {
	
	if(x.length-1==cabacety) {
	System.out .println("the stack is full....................");
	}
	else {
	int value=((first+size) % cabacety) ;
	x[value]=e;
	size++;
	}}
public int dequeue() {
	if(!isEmpty()) {
	int element=x[first];
	first=(first+1)%cabacety;
	size--;
	return element;}
	else 
	return -1;
}
}
