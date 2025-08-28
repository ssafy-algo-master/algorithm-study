package day17_0824.boj.색종이2563;

import java.util.Scanner;

public class BOJ_2563_임정인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[101][101];
		
		// 색종이 수
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int cc = sc.nextInt();
			int cr = sc.nextInt();
			// cr +10, cc +10을 순회 하면서 1을 넣는다
			for (int i = cc; i < cc + 10; i++) {
				for (int j = cr; j < cr + 10; j++) {
					arr[i][j] = 1;
				}
			}
		} // 색종이 붙이는 반복문 끝

		// 넓이 세기
		int paper = 0;
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				if (arr[i][j] == 1)
					paper += 1;
			}
		}
		System.out.println(paper);
	}
}