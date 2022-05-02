package chapter04;

public class StringTest03 {
	public static void main(String[] args) {
		//String method 들..
		String s1 = "aBcABCabcAbc";
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("abc",7));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 5));
		
		String s2 = "    ab    cd    ";
		String s3 = "efg,hij,klm,nop,qrs";
		String s4 = s2.concat(s3);
		System.out.println(s4);
		
		System.out.println("---"+s2.trim()+"--");//양끝의 공백지우기
		System.out.println("---"+s2.replaceAll(" ", " ")+"---");
		
		String[] tokens1 = s3.split(",");
		for(String s: tokens1) {
			System.out.println(s);
		}
		String[] tokens2 = s3.split(" ");
		for(String s : tokens2) {
			System.out.println(s);
		}
		// + String concat  연결연산자
		//String s5 = "Hello" + "Wolrd" + "Java"+ "1.8";
		String s5 = new StringBuffer("Hello")
		.append("Wolrd")
		.append("Java")
		.append(1.8)
		.toString(); //여러 문자열또는 각자의 타입을 정해서 스트링정의가 가능
		
		String s6 = new String("");
		for(int num=0; num<100000;num++) {
			//s6 = s6 + num;
			//s6 = new StringBuffer(s6).append(num).toString();

		}
		
		StringBuffer sb6 = new StringBuffer("");
		for(int num=0; num<100000;num++) {
			sb6.append(num);
		}
		String s7 = sb6.toString();
		System.out.println(s7.length());
	}

}
