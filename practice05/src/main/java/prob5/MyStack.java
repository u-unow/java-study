package prob5;

public class MyStack<T> {//<T>로 위 클래스내의 String은 T로 변경
	private int top = 0;//buffer = (T[])new Object[capacity]
	private T[] buffer;
	
	public MyStack(int size) {
		buffer = new String [size];

	}
	public void push(T item) {
		

	}
	public T pop() {
		return null;
	}
	public boolean isEmpty() {
		return top ==1 ;
	}
	
}