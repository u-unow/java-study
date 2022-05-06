package chapter03;

import java.util.Arrays;

public class ArrayUtillTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d1 = ArrayUtill.intToDouble(new int[] {10,20,30,40});
		/*for(double d : d1) {
			 System.out.println(d+ " ");
		}*/
		System.out.println(Arrays.toString(d1));
		System.out.println(d1);

		int[] a1 = ArrayUtill.DoubleToint(new double[] {10.1,20.2,30.3,40.4});
		int[] a2 = ArrayUtill.concat(new int[]{1, 2, 3}, new int[]{4, 5, 6});
		System.out.println(Arrays.toString(a1));
		System.out.println(a1);
		System.out.println(Arrays.toString(a2));
		System.out.println(a2);
	}
}
