package stack;

public interface genaric_stack<T> {
	boolean isempty();
	T top();
	int size();
	void push(T e);
	T pop();
	void clear();
	
}
