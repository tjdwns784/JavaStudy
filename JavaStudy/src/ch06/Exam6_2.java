package ch06;

public class Exam6_2 {
//	 수박의 무게가 10kg이 넘으면 1등급, 7kg이 넘으면 2등급, 4kg이 넘으면 3등급,
//	  나머지는 4kg등급을 부여하는 checkGrade 메소드 만들기
//	public static void main(String[] args) {
//
//		int a = water(11);
//
//		System.out.println(a + "등급");
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