package ch03;

import java.util.Random;
import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {
		// ����:0  ����:1  ��:2
		System.out.println("����:0, ����:1, ��:2 �Է����ּ���.");
		
		Scanner s = new Scanner(System.in);
		
		int �� = s.nextInt(); // ����
		
		// 0 ~ 2  ���� ���� �������� ����
		// ��� 1 Math.random() 0.0 <= ran , 1.0
		double ran = Math.random() * 3; // 0.0 ~ 2.9999999999
		
		// ��� 2 Random 
		Random random = new Random();
		int ran2 = random.nextInt(3); // 0 ~ 2
		
		int ���� = (int) ran; // ����
		
		System.out.println("������ �� ���� : " + ����);
		if( (�� + 1) % 3 == ���� ) { // ���� ��
			System.out.println("��");
		} else {
			if(�� == ����) { // ���
				System.out.println("���");
			} else { // ���� �̱�
				System.out.println("�̱�");
			}
		}
	}
}
