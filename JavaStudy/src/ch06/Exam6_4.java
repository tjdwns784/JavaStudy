package ch06;

public class Exam6_4 {
	//	 1 / 3 / 5 / 7 / 8 / 10 / 12���� 31��, 4 / 6 / 9 / 11���� 30��, 2���� 28�ϱ��� ����
	//	 Ư�� ���� �Է��ϸ� �ش��ϴ� ���� ��¥ ���� ��ȯ�ϴ� getLastYear �޼ҵ� �����
	public static void main(String[] args) {

		
		
		
	}



	
	static int getLastYear(int month) {
		if(month == 1 || month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
			return 31;
		} else if(month == 4 | month == 6 | month == 9 | month == 11) {
				return 30;
			} else {
				return 28;
			}
		}
}
	
	
