package ch06;

public class Exam6_3 {
	//	두 개의 정수 a, b가 입력되었을 때 a 와 b 사이에 속한 모든 정수의 합을 반환하는
	//	 getBetweenSum 메소드 만들기
	//	조건 1) a와 b가 같은 경우 둘 중 아무 수나 반환
	//  조건 2) a와 b는 대소 관계가 정해져 있지 않음
	public static void main(String[] args) {

		int sum = getBetweenSum(1, 3);
		System.out.println(sum);
		
		
	}
	static int getBetweenSum(int a, int b) {
//		a = (a > b) ? a : b;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int total = 0;
		
		for(int start = a; start <= b; start++) {
			total = total + start;
		}
		return total;
	}

}