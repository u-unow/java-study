package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10, 10);
		Class klass = p.getClass();
		System.out.println(p.getClass().getName());//reflection 클래스의 정보를 가져올수있음
		System.out.println(p.hashCode());	//address 기반의 해싱값
											//address x
										    //reference x
		System.out.println(p.toString());	//getClass() + "@" + hashCode
											// 클래스 주소(chapter04.Point  @  626b2d4a
		System.out.println(p);
	
	}
}