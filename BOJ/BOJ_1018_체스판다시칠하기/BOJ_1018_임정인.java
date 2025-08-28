package day16_0823.swea.체스판다시칠하기1018;

import java.util.Scanner;

public class BOJ_1018_임정인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // r 값 입력
		int M = sc.nextInt(); //c 값 입력
		sc.nextLine(); // 남아있는 줄바꿈 문자 제거용
		char[][] board = new char[N][M];

		for (int r = 0; r < N; r++) { // N개 줄 읽어야함
			String rowStr = sc.nextLine(); 
			for (int c = 0; c < M; c++) {
				board[r][c] = rowStr.charAt(c);

			}
		}

		// 8x8 최대 수정개수 64개를 초기값으로 설정
		int minCount = 64;

		// 8X8 영역만큼 탐색하여 칠할 개수 세기
		// 전체 보드 순회
		for (int startR = 0; startR <= N - 8; startR++) {
			for (int startC = 0; startC <= M - 8; startC++) {

				// 경우 1 : (0,0)이 W로 시작
				int countW = 0;
				// 경우 2 : (0,0)이 B로 시작
				int countB = 0;

				// 8x8크기만큼 탐색
				for (int r = 0; r < 8; r++) {
					for (int c = 0; c < 8; c++) {
						char currentCell = board[startR + r][startC + c];

						// 홀수 좌표와 짝수 좌표를 나눠서 칠할 곳의 개수를 카운트
						// 짝수 칸
						if ((r + c) % 2 == 0) {
							if (currentCell != 'W')
								countW++;
							if (currentCell != 'B')
								countB++;
							// 홀수 칸
						} else {
							if (currentCell != 'B')
								countW++;
							if (currentCell != 'W')
								countB++;
						}
					}
				}
				// 3.현재 8x8 영역의 최솟값을 전체 최솟값과 비교해서 갱신
				int currentMin = Math.min(countW, countB);
				if (currentMin < minCount) {
					minCount = currentMin;
				}

			}
		}
		System.out.println(minCount);
	}
}
