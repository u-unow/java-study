package chapter03;

public class StaticMethod {
	int n;
	static int m;

	void f1() {
		System.out.println(n);//instance method에서는 instance 변수에 접근 가능 
	}
	void f2() {
		System.out.println(m);// 같은 클래스에서는 클래스(static) 변수접근에서는 클래스이름이 생략가능
	}
	void f3() {
		f2();
	}
	void f4() {
		s1();				  // 같은 클래스에서는 클래스(static) 메소드 접근에서는 클래스이름이 생략가능
	}
	static void s1() {
		//오류 : static method 에서는 인스턴스 변수에 접근 할 수 없다.
		//System.out.println(n);
	}
	static void s2() {
		System.out.println(StaticMethod.m);
		// 같은 클래스에서는 클래스(static) 변수접근에서는 클래스이름이 생략가능
	}
	static void s3() {
		// 오류 : static method에서는 인스턴스 메소드에 접근 할 수 없다. 
		// f1();
	}
	static void s4() {
		StaticMethod.s1();
		// 같은 클래스에서는 클래스(static) 메소드 접근에서는 클래스이름이 생략가능
		s1();
	}
}
