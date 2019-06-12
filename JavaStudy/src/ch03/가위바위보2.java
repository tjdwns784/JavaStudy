package ch03;

public class 가위바위보2 {
	public static void main(String[] args) {
		// 가위:0  바위:1  보:2
		int 나 = 2; // 가위
		int 상대방 = 0; // 바위
		
		if( (나 + 1) % 3 == 상대방 ) { // 내가 짐
			System.out.println("짐");
		} else {
			if(나 == 상대방) { // 비김
				System.out.println("비김");
			} else { // 내가 이김
				System.out.println("이김");
			}
		}
	}
}
