package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for(int i =1; i<100;i++)
		{
			if (i==3 | i==6 | i==9)
			{
				System.out.print(i+"짝\n");
			}
			else if(i%10==3 |i%10==6 | i%10==9)
				System.out.println(i+"짝");
			else if(i/10 ==3 | i/10 == 6| i/10 ==9)
			{
				System.out.println(i+"짝");
			}
			if(i%33==0 | i%66==0 | i%99==0)
			{
				System.out.println(i+"짝짝");
			}
		}
	}
}
