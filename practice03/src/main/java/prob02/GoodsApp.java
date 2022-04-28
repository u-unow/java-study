package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		for(int num = 0; num<COUNT_GOODS; num++) {
			String line = scanner.nextLine();
			System.out.println(line);
			String[] token = line.split(" ");
			String name = token[0];
			int price = Integer.parseInt(token[1]);
			int count = Integer.parseInt(token[2]);
			
			System.out.println(name + "(가격:"+price+"원)이 "+count+"개 입고 되었습니다.");
		}
		// 상품 입력
		
		// 상품 출
		
		// 자원정리
		scanner.close();
	}
}
