package ch04;

// 소스 코드 정렬  : shift + ctrl + f
public class 숫자합 {
	public static void main(String[] args) {
		int num = 123456789;
	
		int total = 0;
		
		for( ; num > 0; num = num / 10 ) {
			int n = num % 10;
			System.out.println(n);
			total += n; //total = total + n
		}
		
		System.out.println(total);	
	}
}