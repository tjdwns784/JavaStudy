package ch05;

public class Mabang2 {
	public static void main(String[] args) {
		// ������ ���ڸ� ������ 2���� �迭 7 x 7
		int[][] mabang = new int[7][7];
	    // row = ����  , col = ����
		// ��Ģ 1 �Ѹ��� �߰����� ����.
		mabang[0][3] = 1;
		int row = 0;
		int col = 3;
		
		// 2 ~ 25 ���� �ݺ�
		for(int i = 2; i <= 49; i++) {
			row = row - 1; // 1�� ����
			col = col - 1; // 1�� ����
			
			// ���� ������ �Ǿ�����
			if(row < 0) {
				// ���� ������ �Ǿ�����
				if(col < 0) {
					row = row + 2;
					col = col + 1;
				//���� �����϶�
				} else {
					row = 6; // row = 7 + row
				}
			// ���� �����϶�
			} else {
				// ���� ������ �Ǿ�����
				if(col < 0) {
					col = 6;
				// ���� �����϶�
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
