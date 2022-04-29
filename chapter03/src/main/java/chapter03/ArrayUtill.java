package chapter03;

public class ArrayUtill {

	public static double[] intToDouble(int[] a) {
		// TODO Auto-generated method stub
		double[] result = new double[a.length];
		for (int num = 0; num < a.length; num++) {
			result[num] = a[num];
		}
		return result;
	}

	public static int[] DoubleToint(double[] ds) {
		int[] result = new int[ds.length];
		for (int num = 0; num < ds.length; num++) {
			result[num] = (int) ds[num];
		}
		return result;
	}

	public static int[] concat(int[] is, int[] is2) {
		int[] result = new int[is.length + is2.length];
		int a=0;
		for (int num = 0; num < result.length; num++) {
			if (num < is.length) {
				result[num] = is[num];
			} else {
				result[num] = is2[a];
				a++;
			}
		}
		return result;
	}
}