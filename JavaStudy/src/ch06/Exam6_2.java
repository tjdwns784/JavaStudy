package ch06;

public class Exam6_2 {
//	 ������ ���԰� 10kg�� ������ 1���, 7kg�� ������ 2���, 4kg�� ������ 3���,
//	  �������� 4kg����� �ο��ϴ� checkGrade �޼ҵ� �����
//	public static void main(String[] args) {
//
//		int a = water(11);
//
//		System.out.println(a + "���");
//	}
//
//	static int water(int kg) {
//		int grade = 0;
//		if (kg > 10) {
//			grade = 1;
//		} else if (kg > 7) {
//			grade = 2;
//		} else if (kg > 4) {
//			grade = 3;
//		} else {
//			grade = 4;
//		}
//		return grade;
//	}
//}
	public static void main(String[] args) {
		int grade = checkGrade(20);
		System.out.println(grade + "");
	}

	static int checkGrade(int weight) {
		if (weight > 10) {
			return 1;
		} else if (weight > 7) {
			return 2;
		} else if (weight > 4) {
			return 3;
		}
		return 4;
	}

}