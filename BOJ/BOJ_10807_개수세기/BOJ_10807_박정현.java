package BOJ_04_1차원배열;

import java.util.Scanner;

public class BOJ_10807_완 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int V = scanner.nextInt();
		
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == V) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);

	} // main
} // class
