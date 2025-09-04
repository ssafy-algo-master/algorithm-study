package aps_0829.boj.수열2559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int maxSum = Integer.MIN_VALUE;
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = i; j <= K; j++) {
				sum += arr[j];
				if (sum > maxSum)
					maxSum = sum;
				else {
					sum =0;
				}
			}
		}
		System.out.println(maxSum);
	}

}
