package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();//각자의 매개변수들로 출력을 할수있게끔

		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
	}
}