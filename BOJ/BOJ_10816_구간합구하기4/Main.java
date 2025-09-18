package 백준_11659_구간_합_구하기4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] num = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int tc = 0; tc < m; tc++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int sum = 0;
			
			for(int d = i; d <= j; d++) {
				sum += num[d];
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}//
}//
