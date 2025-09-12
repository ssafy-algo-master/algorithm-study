package BOJ_04_1차원배열;

import java.util.Scanner;

public class BOJ_10818 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// N을 입력받는다.
		int N = scanner.nextInt();
		
		// N 크기 만큼의 배열을 만든다.
		int[] arr = new int[N];
		
		// arr에 값을 넣는다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
			
			if (arr[i] < min) {
				min = arr[i];
			}			
		}
		
		System.out.println(min + " " + max);
		
	} // main

} // class
