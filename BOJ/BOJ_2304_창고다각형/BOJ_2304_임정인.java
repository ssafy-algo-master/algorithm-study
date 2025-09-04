package day23_0903.boj.창고다각형2304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] pillars = new int[1001];

		// 최대 기둥값
		int maxH = 0;
		// 최고 기둥의 L
		int maxL = 0;

		// 기둥의 개수
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt(); // 왼쪽 면 위치
			int H = sc.nextInt(); // 높이 위치
			pillars[L] = H;
			if (pillars[L] > maxH) { // 최대 기둥값 구하기
				maxH = pillars[L];
				maxL = L; // 최대 기둥의 L

			}
		}
		int answer = 0;
		answer += maxH; // 최고높이의 면적 먼저 더하기

		// 왼쪽 끝부터 중앙까지 최고 H 나오면 갱신하면서 면적 더하기
		int H = 0; 
		for (int i = 0; i < maxL; i++) {
			int current = pillars[i]; // 현재위치의 높이
			if (current > H) {
				H = current; // 현재 위치의 높이가 H보다 더 높으면 그 높이로 면적 구하기
				answer += H; 
			} else {
				answer += H;
			} // 더 높지 않으면 기존의 높이로 더하기
		}
		H = 0; 
		for (int i = 1000; i > maxL; i--) {
			int current = pillars[i]; 
			if (current > H) {
				H = current; 
				answer += H;
			} else {
				answer += H;
			} 
		}
		System.out.println(answer);
	}
}
