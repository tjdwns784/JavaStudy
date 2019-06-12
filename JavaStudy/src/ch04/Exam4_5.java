package ch04;

public class Exam4_5 {
	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;

		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);

			// 이 코드는 주사위 두개 합이 10일때
//			System.out.println("(" + num1 + "," + num2 + ")");
//			
//			count++;
//			
//			if(num1 + num2 == 10) {
//			
//			isContinue = false;}
			
			// 이 코드는 주사위 두개가 똑같은게 나왔을때
			System.out.println("(" + num1 + ", "+ num2 + ")");
			
			count++;
			
			if(num1 == num2) {
				
			isContinue = false; }		
		}
		System.out.println("주사위를 던진 횟수 : " + count);
	}
}
