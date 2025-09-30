package 섬의개수4963;

import java.util.Scanner;

public class BOJ_4963_임정인 {
	static int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
	static int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };
	static int count;
	static int[][] arr;
	static int h;
	static int w;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			if(!sc.hasNext()) break; //다음 입력값이 없으면 브레이크
			w = sc.nextInt();
			h = sc.nextInt();
			
			if(w == 0 && h == 0) break;

			arr = new int[h][w]; // 입력
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			count = 0; // 정답 변수
			
			// 시작좌표를 가지고 가서 깊이우선탐색
			for (int r = 0; r < h; r++) {
				for (int c = 0; c < w; c++) {
					// 이 좌표가 1이면 거기로부터 DFS해야됨
					// 0이면 아예 연결된 주변을 탐색할 필요가 없음
					if (arr[r][c] == 1) {
						arr[r][c] = 2; // 방문 표시
						DFS(r, c);
						count++;
					} else
						continue; // 시작좌표가 0이면 다음 칸으로 넘어가
				}
			}
			System.out.println(count);
		}
	}

	
	public static void DFS(int cr, int cc) {

		for (int d = 0; d < 8; d++) {
			int nr = cr + dr[d];
			int nc = cc + dc[d];

			if (nr < 0 || nr >= h || nc < 0 || nc >= w) {
				continue;
			}
			
			if (arr[nr][nc] == 1) {
				arr[nr][nc] = 2; // 방문표시
				DFS(nr, nc);
			} // 이동한 곳이 0이면(섬이 아니면) 탐색 끝내
			else if (arr[nr][nc] == 0) {
				continue;
			}
		} // 다 돌았는데 1이 없으면 호출부로 돌아가서 다음 좌표
		return;
	}
}
