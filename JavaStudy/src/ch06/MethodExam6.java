package ch06;

public class MethodExam6 {
	public static void main(String[] args) {
		int num = 10;

		int[] nums = { 10, 20, 30 };

		changeValue(num); // call by value
		System.out.println("호출 후 : " + num);

		changeValue(nums); // call by reference
		System.out.println("호출 후 : " + nums[0]);
	}

	static void changeValue(int num) {
		num = num * 10;
		System.out.println("1번 : " + num);
	}

	static void changeValue(int[] nums) {
		nums[0] = nums[0] * 10;
		System.out.println("2번 : " + nums[0]);
	}
}