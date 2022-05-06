package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		// == : 두 객체의 동일성 비교
		System.out.println(p1==p2); // 동일성 X 동질성 O
		System.out.println(p2==p3); // 동일성 비교 합격 ture
		
		// equals 메소드 : 두 객체의 동질성(내용비교)
		//			   : 부모클래스 Object 기본 구현은 동일성(==)비교와 같다.
		
		System.out.println(p1.equals(p2)); 
		System.out.println(p3.equals(p2)); 

	}
}