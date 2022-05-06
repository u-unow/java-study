package prob5;

<<<<<<< HEAD
public class MyStack {
	private int top = 0;
	private String[] buffer;
	
	public MyStack(int size) {
		buffer = new String [size];

	}
	public void push(String item) {
		

	}
	public String pop() {
		return null;
	}
	public boolean isEmpty() {
		return;
=======
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
>>>>>>> branch 'master' of https://github.com/u-unow/java-study
	}
	
}