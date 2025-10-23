// 숨바꼭질

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1697_김소연 {
	
	static int MAX = 100000;
	static int[] time = new int[MAX+1];//방문체크, 최단시간 측정
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //수빈이 위치
		int K = sc.nextInt(); //동생 위치
		
		System.out.println(bfs(N, K));
	}
	
	//bfs
	static int bfs(int start, int end) {
		Queue<Integer> q = new ArrayDeque<>();
		q.add(start); // 현재 좌표
		
		while(!q.isEmpty()) {
			int x = q.poll();
			if(x == end) {
				return time[x];
			}
			
			//이동 3가지
			int[] move = {x-1, x+1, x*2};
			for(int i = 0; i < move.length; i++) {
				int nx = move[i];
				if(nx >= 0 && nx <= MAX && time[nx] == 0) {
					time[nx] = time[x] + 1; //시간 + 1
					q.add(nx);
				}
			}
		}
		return -1;
	}//bfs
		
} // class
