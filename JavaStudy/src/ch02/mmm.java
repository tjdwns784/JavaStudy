package ch02;

public class mmm {
	public static void main(String[] args) {
		
		// ����ȯ ��� ���
		// 1. �ƽ�Ű�ڵ� Ȱ���ϱ�
		// 2. �Ҽ��� ������
		int i = 0;
		short s = 0;
		i = s;  //���� 4byte > 2byte
		
		s = (short)i;
		
		double ���ڱݾ� = 1231.123;
		int ������ü�� = 10000 + (int)���ڱݾ�;
		System.out.println(������ü��);
		
		
		byte b = 127;   // -128 ~ 127
		b++; // 1 ���� ������
		System.out.println(b);
	}
}
