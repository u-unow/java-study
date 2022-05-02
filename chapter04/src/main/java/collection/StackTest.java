package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> s = new Stack<>();
		s.push("둘리");
		s.push("마이콜");
		s.push("또치");
		
		while(!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}
		//비어있는 경우   Excption예외 발생
		//s.pop();
		s.push("둘리");
		s.push("마이콜");
		s.push("또치");
		//peek는 팝당할 변수를 팝하지않고 보여주기만함
		System.out.println(s.pop()+s.peek()+"\n"+s.pop());
	}

}
