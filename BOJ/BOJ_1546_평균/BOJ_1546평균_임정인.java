package day14_0820.boj.평균1546;

import java.util.Scanner;

public class BOJ_1546평균_임정인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] subjects = new int[N]; // 과목 수 N을 입력받고 배열 생성
		double M = 0; 
		int sum = 0;
		for (int i = 0; i < N; i++) {
			subjects[i] = sc.nextInt(); // 과목의 점수들을 입력받기
			sum += subjects[i]; //원본 점수 총합
			if (subjects[i] > M)
				M = subjects[i]; // 최댓값 구하기
		}
		
		//새로운 평균 계산 공식 (원본 점수합 *100.0) / M / N
		double answer = (sum * 100.0) / M / N;
		System.out.println(answer);
	}

}
