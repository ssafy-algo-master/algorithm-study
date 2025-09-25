package day0924;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_4344_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			
			double sum = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			//System.out.println(Arrays.toString(arr));
			//System.out.println(sum);
			
			double average = sum / N;
			double overAverageCount = 0;
			//System.out.println("평" + average);
			for(int i = 0; i < N; i++) {
				if(arr[i] > average) {
					overAverageCount++;
				}
			}
			//System.out.println(overAverageCount);
			double result = (overAverageCount / N) *100;
			System.out.printf("%.3f%%\n",result);
		}//tc

	}

}
