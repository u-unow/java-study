package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyClass myClass = new MyClass();
			myClass.danger();
		} catch (IOException e) {
			System.out.println("Not have you File "+e);
		}catch (MyException e) {
			System.out.println("Not have My File "+e);
		}
	}

}
