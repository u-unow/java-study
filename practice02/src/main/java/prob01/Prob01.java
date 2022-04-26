package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		/* 코드 작성 */
		int i=scanner.nextInt();
		int reset= 0;
		for(int num = 0; num < MONEYS.length; num++)
		{
			reset = i / MONEYS[num];
			i = i%MONEYS[num];
			System.out.println(MONEYS[num]+"원 : "+reset+"개");
	
		}
		
		scanner.close();
 	}
}