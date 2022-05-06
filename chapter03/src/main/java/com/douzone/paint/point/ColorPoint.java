package com.douzone.paint.point;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		// TODO Auto-generated constructor stub
//		setX(x);
//		setY(y);
		super(x,y);
		this.color = color;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("점[X=" + getX() + ",점 Y=" + getY() + ", color=" + color +"]을 그렸습니다.");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
