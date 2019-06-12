package ch04;

public class WhileExam1 {
	public static void main(String[] args) {
		int num = 12345678;

		int total = 0;

		while (num > 0) {
			int n = num % 10;

			total = total + n;

			num = num / 10;
		}

		System.out.println("각 자리 숫자의 합 : " + total);
	}
}