package ch04;

public class Exam4_6 {
	public static void main(String[] args) {
		/*
		  4   *
		  3  **
		  2 ***
		  1****
		  *****
		 */
		int space = 4; // 여백 4
		
		for(int i = 1; i <= 5; i++) {	
			for(int j = 1; j <= 5; j++) {
				// j의 값이 여백보다 적다면 공백, 아니면 *
				if(j <= space) {
					System.out.print(" ");// ""사이에 공백안넣으면 반대로 나옴.
				} else {
					System.out.print("*");
				}
			}
			space -= 1; // space = space -1;
			System.out.println();
		}
	}
}
