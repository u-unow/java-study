package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		int num=0;
		int odd=0;
		int even=0;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if(num %2 ==0)
		{
			for(int a1=0; a1<=num; a1=a1+2)
			{
				even += a1;
				System.out.println(even);
			}
			System.out.println(even);
		}
		else
		{
			for(int a1=1; a1<=num; a1=a1+2)
			{
				odd += a1;
				System.out.println(odd);
			}
			System.out.println(odd);
		}
		
			scanner.close();
	}
}