package ch04;

import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean b = true;
		
		while(b) {
			// 가위:0  바위:1  보:2
			int 나 = s.nextInt();
			
	
			double ran = Math.random() * 3; // 0.0 ~ 2.9999999999
			int 상대방 = (int) ran; // 바위
			
			if( (나 + 1) % 3 == 상대방 ) { // 내가 짐
				System.out.println("짐");
			} else {
				if(나 == 상대방) { // 비김
					System.out.println("비김");
				} else { // 내가 이김
					System.out.println("이김");
					b = false;
				}
			}
			} // end while
		}
	}
