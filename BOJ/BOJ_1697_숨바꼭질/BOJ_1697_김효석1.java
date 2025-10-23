import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1697_김효석1 {
	//클래스
	static class Point {
		int start;//시작점
		int time;// 경로마다 시간이 달라서 스타트점 움직임과 같이 구하자
		
		public Point(int start, int time) {
			this.start = start;
			this.time = time;
		}
	}
	
	static int N, K;//N은 시작점 , K는 찾는점
	static boolean[] visit = new boolean[100001];
	
	
	
	
	public static void main(String[] args) {
		//BFS
				Scanner sc = new Scanner(System.in);
				
				 N = sc.nextInt();
				 K = sc.nextInt();
				 //같으면 0출력
				if(N == K) {
					System.out.println(0);
					return;
				} else {
				int result = bfs();
				
				System.out.println(result);
				}
				
				

			}
			
			public static int bfs() {
				//큐,  add, visit, while
				Queue<Point> q = new LinkedList<>();
				
				q.add(new Point(N,0));//시작점에 N, 시간에 0
				visit[N] = true;
				
				while(!q.isEmpty()) {
					Point current = q.poll();
					//종료조건 => 현재 위치가 K에 도달하면? 반환
					if(current.start == K) {
						return current.time;
					}
					//다음 위치 세개 
					int[] nextP = {current.start+1, current.start-1, current.start *2};
					
					//구해줭
					for(int nP : nextP) {
					if(nP >= 0 && nP <= 100000) {
						//방문 안함 > 방문처리 > 다음 부르기
						if(visit[nP] == false) {
							visit[nP] = true;
							q.add(new Point(nP, current.time+1));
						}
						
					}

						
						
						
					}
					
				}
				
				return -1;
			}
			

		}