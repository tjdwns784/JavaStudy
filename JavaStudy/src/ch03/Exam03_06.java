package ch03;

import java.util.Scanner;

public class Exam03_06 {
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);        
			 System.out.print("2자리수 정수 입력(10~99)>>");         
			 int n = scanner.nextInt();
			 int ten = 0; // 10의 자리 수를 저장할 변수        
			 int one = 0; // 1의 자리 수를 저장할 변수 
		 
		        boolean isMatch = false; // 두 자리 수 비교 값을 저장할 변수 
		        ten = n / 10;
		        one = n % 10;
		        
		        /* ten 변수에 10의 자리 수 대입 */         /* one 변수에 1의 자리 수 대입 */ 
		 
		        /* isMatch 변수에 두 개의 자리 수 비교 값 저장 */  
		        isMatch = ten == one;
		        System.out.println(isMatch);            
		        scanner.close();   
		}

}
