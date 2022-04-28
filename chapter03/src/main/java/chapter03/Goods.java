package chapter03;

public class Goods {
	//메인앞에 static을 붙이는 이유
	public static int countOfGoods = 10;
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods(String name) {
		
		this.name = name;
		countOfGoods = countOfGoods + 1 ;
		
	}
	public Goods() {
		countOfGoods = countOfGoods + 1 ;
		
	}
	public Goods(String name, int price, int countStock, int countSold) {
		countOfGoods = countOfGoods + 1 ;
		
		this.countSold = countSold;
		this.countStock = countStock;
		this.name = name;
		this.price= price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// 값을 보호
		if(price < 0) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public void ShowInfo() {
		System.out.println("name : "+name+", price : "+price+", countStock : +countStock"+", countSold : "+countSold);
	}
	public int calcDiscountPrice(double discountRate) {
		// TODO Auto-generated method stub
		return (int)discountRate * price;
	}
}
