package ch06;

import java.util.Scanner;

public class Method1 {
	// ��������, ������� <= Ŭ���� ����
	static int age;
	int score;
	
	
	static int input() {
		// ��������
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("���� �Է����ּ���.");
		// ��������
		int num = input();
		
		if(num > 5) {
			num = num - 5;
		}
		// int 1 <= ��������
		for(int i = 0; i < 5; i++) {
			
		}
		
		System.out.println("�Էµ� ����?" + num);
		
	}
}
