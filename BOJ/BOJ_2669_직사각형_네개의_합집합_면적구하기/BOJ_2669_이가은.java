package BOJ.직사각형네개의합집합의면적구하기2669;

import java.util.Scanner;

public class BOJ_2669_이가은 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 모든 x, y 좌표는 1이상이고 100이하인 정수
		// -> 0이상이고 99이하인 정수 인덱스로 변환해서 배열에 넣자
		boolean[][] arr = new boolean[100][100];
		
		// 네개의 직사각형
		for (int i=0; i<4; i++) {
			int x1 = sc.nextInt()-1;
			int y1 = sc.nextInt()-1;
			int x2 = sc.nextInt()-1;
			int y2 = sc.nextInt()-1;
			
			// x1~x2에 대해
			for (int j=x1; j<x2; j++) {
				// y1~y2에 대해
				for (int k=y1; k<y2; k++) {
					arr[j][k] = true;
				}
			}
		}
		
		// true로 색칠된 부분만 몇개인지 세기
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j])
					sum += 1;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}

