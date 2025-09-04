package BOJ.수열2491;

import java.util.Scanner;

public class BOJ_2491_이가은 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력 받기
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 길이 최소는 1
		int maxCnt = 1; // 가장 길었던 수열 저장할 변수
		int higherCnt = 1; // 오름차순 수열 길이 저장 변수
		int lowerCnt = 1; // 내림차순 수열 길이 저장 변수 
		for (int i=1; i<N; i++) {
			// 같거나 더 크면 오름차순 길이 += 1 , 아니면 1로 초기화
			if (arr[i] >= arr[i-1])
				higherCnt++;
			else
				higherCnt = 1;
			
			// 같거나 더 작아지면 내림차순 길이 += 1, 아니면 1로 초기화
			if (arr[i] <= arr[i-1])
				lowerCnt++;
			else
				lowerCnt = 1;
			
			// 지금까지의 길이가 가장 길었으면 저장
			maxCnt = Math.max(maxCnt, higherCnt);
			maxCnt = Math.max(maxCnt, lowerCnt);
		}
		
		System.out.println(maxCnt);
		
		sc.close();
	}
}
