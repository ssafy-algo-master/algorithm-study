package boj.계단오르기2579;

import java.util.Scanner;

public class BOJ_2579_임정인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N + 1];

		// 각 계단의 점수 입력
		for (int i = 1; i <= N; i++) {
			score[i] = sc.nextInt();
		}
		// dp 테이블 생성
		int[] dp = new int[N + 1];

		// dp = 1일때
		dp[1] = score[1];
		if (N == 1) {
			System.out.println(dp[1]);
			return;
		}
		// dp = 2일때
		dp[2] = score[1] + score[2];
		if (N == 2) {
			System.out.println(dp[2]);
			return;
		}
		// dp = 3이상일 때
		for (int i = 3; i <= N; i++) {
			// 두칸 점프 , 한칸+한칸 중에 max값 구하기
			dp[i] = Math.max(dp[i - 2] + score[i], dp[i - 3] + score[i - 1] + score[i]);
		}

		System.out.println(dp[N]);
	}

}
