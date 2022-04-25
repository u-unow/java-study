package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int a, b,c=1;
		for(a=1;a<10;a++)
		{
			c=a;
			for(b=1;b<=10;b++)
			{
				System.out.print(c+" ");
				c++;
			}
			c=c++;
			System.out.println("\n");
		}
	}
}
