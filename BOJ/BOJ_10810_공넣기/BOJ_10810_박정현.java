package BOJ_04_1차원배열;

import java.util.Scanner;

public class BOJ_10810 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 바구니 N개
		int N = scanner.nextInt();
		
		// M번 공을 넣으려고 한다.
		int M = scanner.nextInt();
		
		// N 크기 만큼의 배열을 만든다.
		int[] arr = new int[N];

		// M번 공을 넣는 작업
		for (int a = 0; a < M; a++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int k = scanner.nextInt();
			
			// i부터 j까지 k번 공으로 채우기 과정
			// 1번 바구니라고 하지만, 배열에서는 0번째이기 때문에 i-1
			for (int x = i-1; x < j; x++) {
				arr[x] = k;
			}
		}
		
		
		for (int x = 0; x < N; x++) {
			System.out.print(arr[x] + " ");
		}
		
		
	} // main

} // class
