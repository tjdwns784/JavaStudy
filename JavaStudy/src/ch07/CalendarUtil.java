package ch07;

import java.util.Calendar;

public class CalendarUtil {
	public static String getDate() {
		// 현재 날짜에 대한 정보
		Calendar c = Calendar.getInstance();
		
		String date = ""; // 날짜 정보 저장 변수 YYYY-MM-DD 2019-06-13
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		
		date = year + "-" + 
				( month < 10 ? "0" + month : month ) +
				( day < 10 ? "0" + day : day );
		return date;
	}
}