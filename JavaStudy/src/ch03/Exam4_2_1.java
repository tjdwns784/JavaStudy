package ch03;

public class Exam4_2_1 {
	public static void main(String[] args) {
		int score = 22;
		
		if(score % 2 == 0 & score % 3 == 0) {
			System.out.println("쿵짝");
		}
			else if(score % 3 == 0) {// 3의 배수인 경우
			System.out.println("쿵");
		}
			else if(score % 2 == 0) {// 2의 배수인 경우
			System.out.println("짝");
		}
		
		
//	오류	if(score % 2 == 0) {// 2의 배수인 경우
//			System.out.println("짝");
//		}
//			else if(score % 3 == 0) {// 3의 배수인 경우
//			System.out.println("쿵");
//		}
//			else if(score % 2 == 0 & score % 3 == 0) {
//			System.out.println("쿵짝");
//		}
		
	}
}