package ch05;

public class Arr1 {
	public static void main(String[] args) {
		int[] scrores = {10,20,30,40,50,60,70};
		
		// int last = scores[ scores.length - 1];
		
		// 5개 공간의 배열 생성
		int[] arr = new int[5]; // 0  0  0  300  0  (순서는 0부터 센다.)
		arr[3] = 300;
		//                    .length => 알아서 5로 해줌.
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[3]);
//		System.out.println(arr[9]); // index Error 왜냐하면 5개만 배열만들었으니까 10번째는 없을 수 밖에없음.
	}
}
