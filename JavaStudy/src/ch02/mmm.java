package ch02;

public class mmm {
	public static void main(String[] args) {
		
		// 형변환 사용 경우
		// 1. 아스키코드 활용하기
		// 2. 소수점 버리기
		int i = 0;
		short s = 0;
		i = s;  //가능 4byte > 2byte
		
		s = (short)i;
		
		double 이자금액 = 1231.123;
		int 통장이체액 = 10000 + (int)이자금액;
		System.out.println(통장이체액);
		
		
		byte b = 127;   // -128 ~ 127
		b++; // 1 증가 연산자
		System.out.println(b);
	}
}
