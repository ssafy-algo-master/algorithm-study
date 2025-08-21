package 백준_10810_공_넣기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 최댓값 변수
		int maxNum = Integer.MIN_VALUE;
		
		// 최댓값 위치 (인덱스) 변수
		int maxIndex = 0;
		
		for(int i = 1; i <= 9; i++) {
			int num = sc.nextInt();
		
			if(num > maxNum) {
				maxNum = num;
				maxIndex = i;
			}
			
			System.out.println(maxNum);
			System.out.println(maxIndex);
		}
		
	}//
}//
