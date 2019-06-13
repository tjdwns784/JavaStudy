package ch06;

public class MethodExam5 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		System.out.println(num1 == num2);

		int[] nums1 = { 1, 2 };
		int[] nums2 = { 1, 2 };
		System.out.println(nums1 == nums2);
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());

		nums1 = nums2;
		System.out.println(nums1 == nums2);
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());
	}
}