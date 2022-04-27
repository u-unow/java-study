package chapter03;

import mypackage.Goods2;

public class EventGoods2 extends Goods2 {
	private float discountRate = 0.5f;
	public String name; 	// 모든 접근이 가능(접근 제한이 없다)
	protected int price;	// 자식접근이 가능 + 같은 패키지
	int countStock; 
	
	public int getDisconutPrice() {
		// protected는 자식에서 접근이 가능하다.
		int discountPrice =(int)(discountRate) * price;
		
		return discountPrice;
	}
}
