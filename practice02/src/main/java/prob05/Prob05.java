package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("게임이 시작되었습니다. 숫자를 입력하시오.");
		Random random = new Random();
		int correctNumber = random.nextInt(100) + 1;
		while (true) {
			int answer = scanner.nextInt();
			/* 게임 작성 */

			// 정답 램덤하게 만들기
			if (correctNumber == answer) {
				System.out.println("정답입니다.");
				System.out.print("다시 하겠습니까(any key/n)>>");
				String question = scanner.next();
				if ("n".equals(question) == true) {
					System.out.println("게임을 종료하겠습니다.");
					break;
				}
				else {
					System.out.println("새로운 정답을 맟추시오.");
					correctNumber = random.nextInt(100) + 1;
				}
			} else if (answer > correctNumber) {
				System.out.println("더 낮게");
			} else if (answer < correctNumber) {
				System.out.println("더 높게");
			}

			// 새 게임 여부 확인하기

			
		}

		scanner.close();
	}

}