package prob01;

public class Printer {
//	public void println(int data) {
//		System.out.println(data);
//	}
//
//	public void println(boolean data) {
//		System.out.println(data);
//	}
//
//	public void println(double data) {
//		System.out.println(data);
//	}
//
//	public void println(String data) {
//		System.out.println(data);
//	}
//	public <T> void println(T t) {
//		System.out.println(t);
//	}
	public <T> void println(T... ts) {
		for (T t : ts) {
			System.out.println(t+" ");
		}
		System.out.println(" ");
	}

	public int sum(int... nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n;

		}
		return sum;
	}
}
