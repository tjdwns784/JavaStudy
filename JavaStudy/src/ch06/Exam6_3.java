package ch06;

public class Exam6_3 {
	//	�� ���� ���� a, b�� �ԷµǾ��� �� a �� b ���̿� ���� ��� ������ ���� ��ȯ�ϴ�
	//	 getBetweenSum �޼ҵ� �����
	//	���� 1) a�� b�� ���� ��� �� �� �ƹ� ���� ��ȯ
	//  ���� 2) a�� b�� ��� ���谡 ������ ���� ����
	public static void main(String[] args) {

		int sum = getBetweenSum(1, 3);
		System.out.println(sum);
		
		
	}
	static int getBetweenSum(int a, int b) {
//		a = (a > b) ? a : b;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int total = 0;
		
		for(int start = a; start <= b; start++) {
			total = total + start;
		}
		return total;
	}

}