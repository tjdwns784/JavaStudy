package ch06;

public class Exam6_5 {
	//	 ���ǿ� �ش��ϴ� dilemma �޼ҵ� �����
	//	 ���� ) ������ A, B�� ü���Ǿ� ���� �ٸ� �����ǿ��� �ݸ��Ǿ� �ɹ��� �ް� ����
	//	 �� ���� �ڹ� ���ο� ���� ���� �Ǵ� �����Ⱓ�� ������
	//	 ���� 1) �� �� �ϳ��� ����Ͽ� �˸� �ڹ��ϸ� �ڹ��� ����� ��� ����ǰ� �������� 10kg���� ����
	//	 ���� 2) �� ��� ���� ����Ͽ� �˸� �ڹ��ϸ� �� �� 5���� ����
	//	 ���� 3) �� ��� �˸� �ڹ����� ������ �� �� 1���� ����
	//	 ���� 4kg) �����ڸ� ��Ÿ���� ���� xa, xb�� �ڹ��ϸ� true, �׷��� ������ false�� ����
	public static void main(String[] args) {
		String result = dilemma(true, false);
		System.out.println(result);
		
	}
	
	
	
	static String dilemma(boolean a, boolean b) {
		if(a && b) {
			return "5��";
		} else if(!a && !b) {
			return "1��";
		} else if(a && !b) {
			return "a ����, b 10��";
		} else if(!a && b) {
			return "a 10��, b ����";
		}
		return "";
	}
	
}
	
	
