package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		
		// 1. �迭 ��� �����ֱ�.
		for (int i = 0; i < nums.length; i++) {
		
			char temp = ' ';
				int abc = (int) (Math.random() * 7); //7��� nums.length�� ǥ��������. ran ��� �ٸ� ���� �ƹ��ų� ����
				temp = nums[0];		
				nums[0] = nums[abc];   
				nums[abc] = temp;	   
		}
		// 2. �迭 ��� �ٸ��ָ鼭 ����ϱ�.
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
			
			if( (i+1) % 3 == 0) {
				System.out.println();
			}
		}
	}
}