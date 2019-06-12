package ch04;

public class Exam4_4_2 {
	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0 & i % 7 == 0) {
			System.out.println(i);
			total += i; //total = total + i;
			}
		}
		System.out.println("гу:" + total);
	}
}
