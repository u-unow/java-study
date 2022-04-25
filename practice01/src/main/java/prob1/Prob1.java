package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner( System.in );
		num = scanner.nextInt();
		if (num%3 ==0)
		{
			System.out.print(num+"은(는) 3의 배수입니다.");
		}
		else
		{
			scanner.close();
			System.out.println(num+"은(는) 3의 배수가 아닙니다.");
		}
	
		scanner.close();
	}
}
