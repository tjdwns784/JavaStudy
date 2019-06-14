package ch07;

public class Exam7_3 {
	public static void main(String[] args) {
		/* Class7_3의 method1() 호출 */
		Class7_3.method1();
	}
}
class Class7_3 {
	int a;

	public static void method1() {
		 System.out.println("method1 실행 시작");
		 /* ?? */
		 Class7_3 c = new Class7_3();
		 for(int i = 0;i<5;i++) {
		/* method2를 호출할 수 있도록 코드 작성 */
		c.method2();
		 }
		 System.out.println("method1 실행 종료");
	}
	public void method2() {
		/* 전역변수 a의 값을 1씩 증가 */
		a = a + 1;
		/* 전역변수 a의 값 출력 */
		System.out.println(a);
	}
}
