package ch03;

public class Exam03_08 {
	public static void main(String[] args) {
		int num = 10;
		
		String a = (num >= 0) ? "양수" : "음수";
		System.out.println((num >= 0) ? "양수" : "음수"); // 삼항 연산자
		
		//양수,음수,0 3가지 경우로 판단
		String result = 
				(num > 0) ? "양수" : 
					(num == 0) ? "0" : "음수";
	
	}
}
