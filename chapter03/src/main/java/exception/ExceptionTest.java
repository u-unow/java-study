package exception;

import javax.naming.spi.DirStateFactory.Result;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10 - a;
		try { 
			
			System.out.println("some code;");
			
			int result = (1 + 2 + 3) / 1;
	
			System.out.println("some code;;"+result);
			System.out.println("some code;;;"+result);
		} catch(ArithmeticException ex)	{
			/* 예외처리 */
			// 1. 사과
			System.out.println("some Sorry;;");
			// 2. 로깅
			System.out.println("error : "+ex);
			// 3. 정상종료
			return;
		}finally {
			 System.out.println("자원정리");
			 
		}
	}	
}
