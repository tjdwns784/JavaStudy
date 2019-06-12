package ch03;
//윤년이면 '윤년입니다', '평년입니다' 라고 출력
//예) year = 1904 '윤년입니다'
// year = 2000 '윤년입니다'
// year = 2200 '평년입니다'
// year = 1997 '평년입니다'
//서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다 (2004년, 2008년, 2012년, 2016년, …)
//이 중에서 100으로 나누어 떨어지는 해는 평년으로 한다 (1900년, 2100년, 2200년, 2300년, 2500년, …)
//이 중에서 400으로 나누어 떨어지는 해는 윤년으로 둔다 (1600년, 2000년, 2400년, …)
//그 이외 모든 해는 평년으로 한다 (1997년, 2003년, 2009년, ...) 
public class Exam4_2_2 {
	public static void main(String[] args) {
		int year = 2200; // 연도
		if(year % 100 == 0) {
			System.out.println("평년");
		} else if(year % 4 ==0) {
			System.out.println("윤년");
		} else if(year % 400 == 0) {
			System.out.println("윤년");
		} else {
				System.out.println("평년");
		}
	}
}