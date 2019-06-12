package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		
		// 1. 배열 요소 섞어주기.
		for (int i = 0; i < nums.length; i++) {
		
			char temp = ' ';
				int abc = (int) (Math.random() * 7); //7대신 nums.length로 표현가능함. ran 대신 다른 문자 아무거나 가능
				temp = nums[0];		
				nums[0] = nums[abc];   
				nums[abc] = temp;	   
		}
		// 2. 배열 요소 꾸며주면서 출력하기.
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
			
			if( (i+1) % 3 == 0) {
				System.out.println();
			}
		}
	}
}