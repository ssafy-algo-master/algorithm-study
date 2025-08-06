package BOJ_3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 올바른 체스 세트 개수: 킹, 퀸, 룩, 비숍, 나이트, 폰(총 6개)
		int[] chess = new int[] {1, 1, 2, 2, 2, 8};
		
		// 동혁이가 찾은 체스 세트 개수 : 총 6개
		// scanner로 입력을 받아옴
		int[] input = new int[chess.length];
		for(int i = 0; i < chess.length; i++) {
			input[i] = sc.nextInt();
		}
		
		// 올바른 체스 개수 - 찾은 체스 세트 개수를 결과값 배열에 넣어줌
		int[] result = new int[chess.length];
		for(int i = 0; i < chess.length; i++) {
			result[i] = chess[i] - input[i];
		}
		
		for(int i = 0; i < chess.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
