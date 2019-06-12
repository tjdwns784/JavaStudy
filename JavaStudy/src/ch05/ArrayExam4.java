package ch05;

public class ArrayExam4 {
	public static void main(String[] args) {
		char[] numbers = { 'a', 'b', 'c', 'd', 'e' };

		
		char temp = ' ';
		for(int i = 0; i < 10000; i++) {
			//                  === > 0 ~ 4 (a,b,c,d,e)
			int ran = (int) (Math.random() * 5);
			temp = numbers[0];
			numbers[0] = numbers[ran];
			numbers[ran] = temp;
		}
		System.out.println(numbers);
	}
}