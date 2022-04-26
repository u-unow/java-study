package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		for(int num=0; num<intArray.length; num++)
		{
			int i=scanner.nextInt();
			intArray[num] = i;
			sum += intArray[num];

		}
		/* 배열에 저장된 정수 값 더하기 */
		/* 출력 */
		System.out.println("입력하신 값들의 평균은 "+sum/intArray.length+"입니다.");
		/* 자원정리 */
		scanner.close();
	}
}
