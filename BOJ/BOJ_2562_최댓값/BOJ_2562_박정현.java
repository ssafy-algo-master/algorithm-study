package BOJ_04_1차원배열;

import java.util.Scanner;

public class BOJ_2562 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// N 크기 만큼의 배열을 만든다.
		int[] arr = new int[9];
		
		// arr[i]에 값을 넣겠다.
		for (int i = 0; i < 9; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = arr[0];
		
		// 첫번째 숫자 라고 말할 거니까 1로 설정
		int index = 1;
		
		for (int i = 1; i < 9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		
	}  // main

} // class
