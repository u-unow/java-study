package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		int i=0;
		// 원래 배열 원소 출력
		//sysoutprintCharArray(c);
		for(int num=0;num<c.length;num++)
		{
			System.out.print(c[num]);
			if(c[num]==' ')
				c[num] =',';
		}
		System.out.println();
		// 공백 문자 바꾸기
		//replaceSpace(c);
		for(int num=0;num<c.length;num++)
		{
			System.out.print(c[num]);
		}
		// 수정된 배열 원소 출력
		//printCharArray(c);
	}

}
