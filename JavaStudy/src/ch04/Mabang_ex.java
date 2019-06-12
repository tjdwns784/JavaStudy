package ch04;

public class Mabang_ex {
	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n];

		// x : 세로축, y : 가로축
		// 첫 좌표값
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1;

		for (int i = 2; i <= n * n; i++) {
			// 다음 숫자를 찍을 좌표 (좌측 대각선)
			x = x - 1;
			y = y - 1;

			if (x < 0) { // 세로축이 음수일때
				if (y >= 0) { // 가로축 0 이상
					// 세로축을 마방진 크기 가장 아래쪽 좌표로 지정
					x = x + n; // x = n - 1;
				} else { // 가로축도 음수일때
					// 원래 위치의 아래쪽 좌표로 지정
					y = y + 1;
					x = x + 2;
				}
			} else {
				if (y < 0) { // 가로축 0 미만
					// 가로축을 마방진 크기 가장 오른쪽 좌표로 지정
					y = n - 1; // y = y + n;
				} else { // 가로축 세로축 정상
					if (mabang[x][y] != 0) { // 다음 위치에 입력된 숫자가 있다면
						// 원래 위치의 아래쪽 좌표로 지정
						y = y + 1;
						x = x + 2;
					}
				}
			}

			mabang[x][y] = i;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}
	}
}