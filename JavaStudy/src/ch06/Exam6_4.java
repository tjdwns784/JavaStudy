package ch06;

public class Exam6_4 {
	//	 1 / 3 / 5 / 7 / 8 / 10 / 12월은 31일, 4 / 6 / 9 / 11월은 30일, 2월은 28일까지 존재
	//	 특정 월을 입력하면 해당하는 월의 날짜 수를 반환하는 getLastYear 메소드 만들기
	public static void main(String[] args) {

		
		
		
	}



	
	static int getLastYear(int month) {
		if(month == 1 || month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
			return 31;
		} else if(month == 4 | month == 6 | month == 9 | month == 11) {
				return 30;
			} else {
				return 28;
			}
		}
}
	
	
