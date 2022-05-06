package com.douzone.paint.main;

import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rectangle;
import com.douzone.paint.shape.Shape;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
//		Point point1 = new Point();
//		point1.setX(20);
//		point1.setY(10);
		Point point1 = new Point(20, 10);

		draw(point1);// ==point1.show();
		Point point2 = new Point(50, 100);

		draw(point2);
		point2.show(false);
		// 하위열 앞줄 컬러포인트에서 컬러를 지우면업캐스팅이 이뤄짐
		ColorPoint point3 = new ColorPoint(40, 50, "red");
		draw(point3);
//		drawPoint(point3);//
//		point3.show(true);//오버라이딩이 안됐지만 실행되는 어떤순서로 실행되는지

		Triangle triangle = new Triangle();
		draw(triangle);
		Rectangle rectangle = new Rectangle();
		draw(rectangle);
		Circle circle = new Circle();
		draw(circle);

		GraphicText graphicText = new GraphicText("Hello World");
		draw(graphicText);

		// instanceof 연산자 테스트
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 오류 : class는 Hierachy상위와 하위만 instanceof 연산자를 사용할 수 있다.
		// System.out.println(cricle intstanceof Rectangle);
		// interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);

	}

	public static void drawPoint(Point point) {
		point.show();
	}

	public static void drawShape(Shape shape) {
		shape.draw();
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
//	public static void drawColorPoint(ColorPoint point) {
//		point.show();
//	}
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw(); 
//	}public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw(); 
//	}
}
