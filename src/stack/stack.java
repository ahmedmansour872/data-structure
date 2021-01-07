package stack;

public class stack <T>implements genaric_stack<T> {
public final int cabacety=10;
public int top=-1;
public int size=0;
public T []x;

public stack( int cab) {
	x=(T [])new Object  [cab];
	}
public boolean isEmpty() {
	if(top==-1)
		return true;
	else return false;
	}
public int size() {
	return (top+1);
	}
public T top() {
	if(!isEmpty()) 
	return x[top];
	else
	return null;
	}
public void clear() {
	top=-1;
	}
public void push(T e) {
	if(cabacety==x.length-1) {
	System.out .println("the stack is full....................");
	}
	else {
	x[++top]=e;
	size++;}
	}
public T pop() {
	T element;
	if(!isEmpty()) {
	element=x[top];
	x[top]=null;
	top--;
	size--;
	return element;}
	else 
	return null;
}
@Override
public boolean isempty() {
	// TODO Auto-generated method stub
	return false;
}


}
