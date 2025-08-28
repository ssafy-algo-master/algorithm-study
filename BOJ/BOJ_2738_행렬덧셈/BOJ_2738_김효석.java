import java.util.Scanner;

public class BOJ_2738_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.행렬의 크기 받기
		int N = sc.nextInt();
		int M = sc.nextInt();

		// 2.행렬 3개 선언
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		int[][] arr3 = new int[N][M];
		
		
		//3.배열 1,2에 각각 값 넣기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr1[i][j] = sc.nextInt();
				
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr2[i][j] = sc.nextInt();
				
			}
		}

		//3. 배열 3에 1,2의 값을 합쳐서 넣기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		
		//4.반복문을 통해 선언
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
		System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}//메인종료

}
