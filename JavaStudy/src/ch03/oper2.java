package ch03;

public class oper2 {
	public static void main(String[] args) {
		int num = 2324;
		int n1 = num % 10;
		System.out.println(n1);
		
		int n2 =(num / 10)% 10;
		System.out.println(n2);
		
		int n3 =(num / 100) % 10;
		System.out.println(n3);
	}
}
