package BOJ_04_1차원배열;

import java.util.Scanner;

public class BOJ_10871 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 정수 N을 받는다.
		int N = scanner.nextInt();
		
		// 정수 X를 받는다. (이보다 작은 수를 찾아야 한다.)
		int X = scanner.nextInt();
		
		// N 크기 만큼의 A 배열을 만든다.
		int[] A = new int[N];
		
		// N 크기 만큼 반복하면서 A배열에 값을 넣는다.
		for (int i = 0; i < A.length; i++) {
			A[i] = scanner.nextInt();
		}
		
		// A를 반복하면서 X보다 작으면 저장한다.
		for (int i = 0; i < N; i++) {
			if (A[i] < X) {
				System.out.print(A[i] + " ");			
			}
		}
		
		
	} // main

} // class
