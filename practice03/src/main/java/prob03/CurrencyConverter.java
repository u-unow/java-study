package prob03;

public class CurrencyConverter {
	private static double rate;
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
		
	}
	public static double toDollar(double doller) {
		double money = doller/rate;
		return money;
	}
	public static double toKRW(double won) {
		double money = won*rate;
		return money;
	}
	
}
