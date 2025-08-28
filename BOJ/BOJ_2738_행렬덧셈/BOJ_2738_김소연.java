import java.util.Scanner;

public class BOJ_2738_김소연 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//행렬 A
		int[][]arrA = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				arrA[i][j] = sc.nextInt();
			}
		}

		//행렬B 입력과 동시에 출력 - arrB 선언x
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				int b = sc.nextInt();
				System.out.print(arrA[i][j] + b+ " ");
			}
			System.out.println();
		}
		
	} // main
} // class
