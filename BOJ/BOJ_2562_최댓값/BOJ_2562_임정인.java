package day17_0824.boj.최댓값2566;

import java.util.Scanner;

public class BOJ_2562_임정인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxValue = 0;
		int maxR = 0;
		int maxC = 0;

		int[][] arr = new int[10][10];
		for (int r = 1; r <= 9; r++) {
			for (int c = 1; c <= 9; c++) {
				arr[r][c] = sc.nextInt();
				if (arr[r][c] >= maxValue) {
					maxValue = arr[r][c];
					maxR = r;
					maxC = c;
				}
			}
		}
		System.out.println(maxValue);
		System.out.println(maxR + " " + maxC);
	}

}
