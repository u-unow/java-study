package chapter04;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
	
		
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 11); //12
		cal.set(Calendar.DATE, 25);

	
		printDate(cal);
		cal.set(2021, 7, 8); //기념일
		cal.add(Calendar.DATE, 300); //300일 뒤
		printDate(cal);
	}

	private static void printDate(Calendar cal) {
		final String[] DAYS  = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		int year = cal.get(Calendar.YEAR); 		// 2000년대에 나옴
		int month = cal.get(Calendar.MONTH); 	// 0~11
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1(일)~7(토)
		int hour = cal.get(Calendar.HOUR);
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		
		System.out.println(
				year + "년 " +
				(month+1 < 10 ? "0" : "") + (month+1) + "월 " +
				(date < 10 ? "0" : "") + date + "일 " +
				DAYS[day-1]+"요일"+
				hour + "시 " +
				minutes + "분 " +
				seconds+"초");
			
	}

}
