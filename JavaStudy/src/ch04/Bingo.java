package ch04;

public class Bingo {
	public static void main(String[] args) {
		for(int i = 1; i <= 25; i++) {
			
			if(i < 10) {
				System.out.print("0" + i + "\t");
			} else {
				System.out.print(i + "\t"); //"\"" + i + "\"\t" Å«µûÀ½Ç¥ ³ª¿È	
			}
			
			
			//ÁÙ ¹Ù²Þ
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
