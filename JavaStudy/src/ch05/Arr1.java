package ch05;

public class Arr1 {
	public static void main(String[] args) {
		int[] scrores = {10,20,30,40,50,60,70};
		
		// int last = scores[ scores.length - 1];
		
		// 5�� ������ �迭 ����
		int[] arr = new int[5]; // 0  0  0  300  0  (������ 0���� ����.)
		arr[3] = 300;
		//                    .length => �˾Ƽ� 5�� ����.
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[3]);
//		System.out.println(arr[9]); // index Error �ֳ��ϸ� 5���� �迭��������ϱ� 10��°�� ���� �� �ۿ�����.
	}
}
