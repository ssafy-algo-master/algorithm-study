package IM;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309_박정현 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 난쟁이 수
		int num = 9;
		
		// 일곱 난쟁이의 키의 합
		int sum = 100;
		
		// 난쟁이 수만큼의 크기를 가진 배열을 만든다.
		int[] arr = new int[9];
		
		// 난쟁이 수만큼의 배열에 값을 입력받는다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// 정렬을 한다.
		Arrays.sort(arr);
		
		int totalsum = 0;
		
		for (int i = 0; i < num; i++) {
			totalsum += arr[i];
		}
		
		////////
		
		int no1 = -1;
		int no2 = -1;
		
		for (int i = 0; i < num - 1; i++) {
			for (int j = i + 1; j < num; j++) {
				if (totalsum - (arr[i] + arr[j]) == 100 ) {
					no1 = i;
					no2 = j;
					break;
				}
			}
			
			if (no1 != -1) break;
		}
		
		
		for (int i = 0; i < num; i++) {
			if (i == no1 || i == no2) continue;
				
			System.out.println(arr[i]);
		}
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(totalsum);
		
	} // main

} // class
