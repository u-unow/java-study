package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] arr = str.toCharArray(); // 
		String -> char[] reversedArr = new char[arr.length]; 
		for(int i=0; i<arr.length; i++)
		{ 
			reversedArr[arr.length-1-i] = arr[i]; 
		} 
		return reversedArr;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}