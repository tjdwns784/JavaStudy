package ch05;

public class ArrayExam5 {
	public static void main(String[] args) {
		int[][] arr1 = new int[][]{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{10, 11, 12}
		};
		int[] inner_arr = arr1[0]; // {1,2,3}
		int value = inner_arr[1]; // 2
		
		int value2 = arr1[0][1]; // 2
		int value3 = arr1[3][1]; // 11
		
		System.out.println(value2);
		System.out.println(value3);
		
		for(int row = 0; row < arr1.length; row++) {
			for(int col = 0; col < arr1[row].length; col++) {
				System.out.println(arr1[row][col]);
			}
		} 
	}
}