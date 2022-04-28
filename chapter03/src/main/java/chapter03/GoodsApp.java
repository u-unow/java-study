package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods = new Goods();
		goods.setName("Nikon");
		goods.setPrice(-1);
		goods.setCountSold(50);
		goods.setCountStock(30);
		
		goods.ShowInfo(); 
		
		Goods goods2 = new Goods("tv", 10000, 10, 10);
		Goods goods3 = new Goods();
		System.out.println("Goods");
		System.out.println("Goods Count:"+Goods.countOfGoods);
		goods.setPrice(2000);
		// discount pricerngkrl
		int discountPrice = goods.calcDiscountPrice(0.5);
		System.out.println("Goods Discount Price : "+ discountPrice);
	
	}
}