package day17_0824.boj.세로읽기10798;

import java.util.Scanner;

public class BOJ_10798_임정인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][15];

		// 가장 긴 길이의 문자열 저장할 변수
		int maxC = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			String str = sc.nextLine();
			if (str.length() > maxC)
				maxC = str.length();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		// c 고정 r순회하며 출력
		for (int c = 0; c < maxC; c++) {
			for (int r = 0; r < 5; r++) {
				// 해당 r에 c값이 없다면 다음 r로 넘어가기
				if (arr[r][c] != '\0') {
					System.out.print(arr[r][c]);
				}
			}
		}
	}
}
