package BOJ.현수막14716;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_14716_이가은 {
	public static int res = 0;
	public static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		// 현수막 입력
		arr = new int[M][N];
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 탐색 시작
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				//1로 글자가 쓰여졌으면 탐색
				if (arr[i][j] == 1) {
					//이 주변 1들을 탐색해서 이게 한 글자인지 탐색
					bfs(i, j);
				}
			}
		}
		
		System.out.println(res);
		sc.close();
	}
	
	public static void bfs(int i, int j) {	
		
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(i, j));
		// 방문 한 곳 -1로 변경
		arr[i][j] = -1;
		
		// 큐 안에 있는 위치에 대해 탐색
		while (!q.isEmpty()) {
			Point current = q.poll();
			int currentX = current.x;
			int currentY = current.y;
			
			// 팔방탐색
			// 상 상우 우 하우 하 하좌 좌 상좌
			int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
			int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
			for(int k=0; k<8; k++) {
				
				// 현수막 범위 벗어나지 않은 범위에서
				if (0<=currentX+dr[k] && currentX+dr[k]<arr.length 
						&& 0<=currentY+dc[k] && currentY+dc[k]<arr[i].length) {
					
					// 방문하지 않은 글자1 을 발견하면
					if(arr[currentX+dr[k]][currentY+dc[k]] == 1) {
						
						//큐에 넣어서 또 방문 예정으로 남겨놓기 
						q.add(new Point(currentX+dr[k], currentY+dc[k]));
						// 방문 예정의 의미로 -1 로 변경
						arr[currentX+dr[k]][currentY+dc[k]] = -1;
					}
				}
				
			}
		}
		
		// 큐에 저장된 주변 1 위치들 다 -1로 바꾸면 이제 한 글자를 찾았다는 의미! 
		res ++;
	}
}	
