package boj.요세푸스문제1158;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1158_임정인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> ansList = new ArrayList<>();

		// list에 숫자 집어넣기
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}

		// 인덱스 구하기
		int s = 0;
		int m = K;
		
		int finalIndex = 0;

		while (!list.isEmpty()) {
			finalIndex = (s + m - 1) % list.size();
		
			// 삭제된 값 위치가 새로운 시작 인덱스
			int k = list.get(finalIndex);
			list.remove(finalIndex);
			ansList.add(k);
			s = finalIndex;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i = 0; i < ansList.size(); i++) {
			sb.append(ansList.get(i));
			
			if(i < ansList.size()-1) {
				sb.append(", ");
			}
		}
		sb.append(">");
		System.out.println(sb);
	}

}
