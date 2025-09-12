package BOJ_04_1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10811 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 바구니 개수
		int N = scanner.nextInt();
		
		// 몇 번 시행할 건지
		int M = scanner.nextInt();
		
		// N 크기 만큼의 배열을 만든다.
		int[] basket = new int[N];
		
		// 바구니가 1번부터 5번까지 나온다.
		for (int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}
		
		// M번 뒤집기 실행
		for (int k = 0; k < M; k++) {
			int i = scanner.nextInt() - 1;
			int j = scanner.nextInt() - 1;
			
			// i ~ j 구간 뒤집기
			while (i < j) {
				int temp = basket[i];
				basket[i] = basket[j];
				basket[j] = temp;
				i++;
				j--;
			}
		}
		
		
		
//		for (int k = 0; k < M; k++) {
//			
//			for (int i = 0; i < N; i++) {
//				for (int j = N; j > 0; j--) {
//					
//				}
//			}
//		}
		// 1 2 3 4 5
		// tmp : 4 3 2
		// 1 4 3 2 5
		
		for (int i = 0; i < N; i++) {
			System.out.print(basket[i] + " ");
		}
		
	} // main

} // class