package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();//각자의 매개변수들로 출력을 할수있게끔

//		printer.println( 10 );
//		printer.println( true );
//		printer.println( 5.7 );
//		printer.println( "홍길동" );
		
		printer.println(10);
		printer.println(true, 5.7);
		printer.println(5.7,"홍길동",20);
		printer.println("=====================");
		
		System.out.println(printer.sum(1,2));
		System.out.println(printer.sum(1,2,3,4,5));
		System.out.println(printer.sum(1,2,3,4,5,6,7,8,9,10));

	}
	
}