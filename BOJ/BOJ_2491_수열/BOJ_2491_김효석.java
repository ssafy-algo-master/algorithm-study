package day0925;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2491_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		//System.out.println(Arrays.toString(arr));
		
		int maxTotal = 1;
		int upCount = 1;
		int downCount = 1;
		
		
		
		for(int i = 1; i < N; i++) {
			if(arr[i] >= arr[i-1]) {
				upCount++;
			} else {
				upCount = 1;
			}
			if(arr[i] <= arr[i-1]) {
				downCount++;
			} else {
				downCount = 1;
			}
			//System.out.println(upCount + "," + downCount);
			
			maxTotal = Math.max(maxTotal, Math.max(upCount, downCount));
		}//for
			
		
			System.out.println(maxTotal);
		
	}

}