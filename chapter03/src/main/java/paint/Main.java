package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(20);
		point1.setY(10);

		drawPoint(point1);// ==point1.show();
		Point point2 = new Point(50, 100);

		drawPoint(point2);
		point2.show(false);
		//하위열 앞줄 컬러포인트에서 컬러를 지우면업캐스팅이 이뤄짐 
		ColorPoint point3 = new ColorPoint(40,50,"red");
		//drawPoint(point3);//
		point3.show(true);//오버라이딩이 안됐지만 실행되는 어떤순서로 실행되는지
		
		Triangle triangle = new Triangle();
		drawTriangle(triangle);
		Rectangle rectangle = new Rectangle();
		drawRectangle(rectangle);
	}
	 
	public static void drawPoint(Point point) {
		point.show();
	}/*public static void drawColorPoint(ColorPoint point) {
		point.show();
	}*/
	public static void drawTriangle(Triangle triangle) {
		triangle.draw(); 
	}public static void drawRectangle(Rectangle rectangle) {
		rectangle.draw(); 
	}
}
