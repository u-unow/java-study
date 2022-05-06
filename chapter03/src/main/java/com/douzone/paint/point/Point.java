package com.douzone.paint.point;

import com.douzone.paint.i.Drawable;

public class Point implements Drawable{
	private int x;
	private int y;
	

	public Point() {

	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("점[X=" + x + "],점[Y=" + y + "]을 그렸습니다.");
	}

	public void show(boolean visible) {
		if (visible) {
			show();//이미구현한 쇼우를 불러서이용 이러면 수정은 한번만 해도됨
		} else {
			System.out.println("점[X=" + x + "],점[Y=" + y + "]을 지웠습니다.");
		}
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	


//	public void disapear() {
//		System.out.println("점[X=" + x + "],점[Y=" + y + "]을 지웠습니다.");
//	}

}
