package prob04;

public class StringUtil {

	public static String concat(String[] strArr) {

		String str="";
		for(int num = 0; num <  strArr.length; num++) {
			str += strArr[num];
		}
		return str;
	}
}
