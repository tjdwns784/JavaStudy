package ch05;

public class Mabang2 {
	public static void main(String[] args) {
		// 마방진 숫자를 저장할 2차원 배열 7 x 7
		int[][] mabang = new int[7][7];
	    // row = 세로  , col = 가로
		// 규칙 1 한면의 중간에서 시작.
		mabang[0][3] = 1;
		int row = 0;
		int col = 3;
		
		// 2 ~ 25 숫자 반복
		for(int i = 2; i <= 49; i++) {
			row = row - 1; // 1행 감소
			col = col - 1; // 1열 감소
			
			// 행이 음수가 되었을때
			if(row < 0) {
				// 열도 음수가 되었을때
				if(col < 0) {
					row = row + 2;
					col = col + 1;
				//열이 정상일때
				} else {
					row = 6; // row = 7 + row
				}
			// 행이 정상일때
			} else {
				// 열이 음수가 되었을때
				if(col < 0) {
					col = 6;
				// 열이 정상일때
				} else {
					if(mabang[row][col] > 0) {
						row = row + 2;
						col = col + 1;
					}
				}
			}
			
			mabang[row][col] = i;
		}
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}
	}
}
