package BOJ_04_1차원배열;

import java.util.Scanner;

public class BOJ_1546 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 과목 개수
		int num = scanner.nextInt();
		
		// 현재 성적
		int[] arr = new int[num];
		
		// 배열 내에 최대값 찾기 위한 선언 및 초기화
		int max = 0;
		double sum = 0;
		double avg = 0;

		// 배열에 값 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt(); 
			
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} 
		
		System.out.println(((sum * 100) / max) / num);
		
	} // main

} // class
