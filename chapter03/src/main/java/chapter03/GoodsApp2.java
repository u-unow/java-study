package chapter03;

import mypackage.Goods2;

public class GoodsApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventGoods2 goods2 = new EventGoods2();
		
		
		goods2.name = "camera";		//public은 모든접근이 가능해서  가능
		goods2.price = 10000; 		//protected 같은패키지라 접근이 가능 || 더 중요한 접근 제어는 자식접근이 가능하다.
		goods2.countStock = 10;		//defalut는 같은패키지라 접근이  가능
		//	goods2.countSold = 10;  //private는 같은 클래스에서만 접근이 가능해서 실패
		
	}

}
