package ch03;

public class Exam4_2_1 {
	public static void main(String[] args) {
		int score = 22;
		
		if(score % 2 == 0 & score % 3 == 0) {
			System.out.println("��¦");
		}
			else if(score % 3 == 0) {// 3�� ����� ���
			System.out.println("��");
		}
			else if(score % 2 == 0) {// 2�� ����� ���
			System.out.println("¦");
		}
		
		
//	����	if(score % 2 == 0) {// 2�� ����� ���
//			System.out.println("¦");
//		}
//			else if(score % 3 == 0) {// 3�� ����� ���
//			System.out.println("��");
//		}
//			else if(score % 2 == 0 & score % 3 == 0) {
//			System.out.println("��¦");
//		}
		
	}
}