package 백준_1244_스위치_켜고_끄기;
//https://www.acmicpc.net/problem/1244

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 스위치 개수
		int[] switchArr = new int[n+1]; // 1번 스위치 ~ n번 스위치
		
		// 스위치 배열 입력받기
		for(int i = 1; i < switchArr.length; i++) {
			switchArr[i] = sc.nextInt();
		}//
		
		int student = sc.nextInt(); // 학생 수
		
		for(int i = 0; i < student; i++) {
			int gender = sc.nextInt();
			int number = sc.nextInt();
			
			// 스위치 배열 다 돌 필요 없음 여학생은 number 기준으로만 처리하면 됨
				
			if(gender == 1) { // 남학생이면
				// 번호가 number의 배수인 스위치만 토글
//				for(int j = 1; j < switchArr.length; j++) {
//					if(j % number == 0) { // 스위치 번호가 자기가 받은 번호의 배수면
//						switchArr[j] = 1 - switchArr[j]; // 스위치 상태 변경(1->0 or 0->1)
//					}
//				}
				
				for(int j = number; j < switchArr.length; j += number) {
					switchArr[j] = 1 - switchArr[j]; // 스위치 상태 변경(1->0 or 0->1)
				}
//				j += number / 매번 number만큼 건너뛰면서 배수 인덱스만 접근
				
			} else { // 여학생이면 (gender == 2)

					
				// 2. 받은 번호의 스위치를 중심으로 좌우 대칭 파악
				// -> 배열 범위 넓혀가면서 탐색
				// -> 배열 범위 벗어나면 중단
				
				int left = number;
				int right = number;
				// ex. 3 // 2 4  // 1 5 //
				// ex. 5 // 4 6  // 3 7  // 2 8 
				// 좌우로 범위 확장
				while(left > 1 && right < n) {
					if(switchArr[left - 1] == switchArr[right + 1]) {
						left--;
						right++;
					} else {
						break;
					}
				}// while e
					
				// 최종구간뒤집기
				for(int k = left; k <= right; k++) {
					switchArr[k] = 1 - switchArr[k];
				}
					
					
			}
				
		}// for문 e
		
		// 결과 출력
		for(int i = 1; i < switchArr.length; i++) {
			System.out.print(switchArr[i] + " ");
			if(i % 20 == 0) {
				System.out.println();
			}
		}
		
		
		sc.close();
	}// main e
}// class e

// 스위치는 1번부터~ 
// 1 스위치 on / 2 스위치 off
// 남학생 1 / 여학생 2

// 학생에게 1 이상이고 스위치 개수 이하인 자연수 번호 하나씩 나눠줌
// 남자 - 스위치 번호가 자기가 받은 번호의 배수면 -> 그 스위치 상태 바꿈
// ex. 남자 번호 3 받음 -> 3번, 6번 스위치 상태 바꿈

// 여자 - 자기가 받은 번호 = 같은 스위치 번호 -> 좌우 대칭이면서 가장 많은 스위치 포함 구간 찾고
// 그 구간에 속한 스위치 상태 모두! 바꿈 (구간에 속한 스위치 개수는 항상 홀수! 좌우 대칭이니꼐)
// ex. 여자 번호 3 받음 -> 3번 스위치 중심으로 2-4번, 1-5번 스위치 상태 보고 좌우대칭이면
// 1번 ~ 5번 스위치 각각 상태 바꿈
// 만약 좌우 대칭 스위치 상태가 서로 다르다면 번호 스위치 상태만 바꿈
// ex. 여자 번호 4 받음 -> 3번, 5번 스위치 상태 다르면 (좌우대칭x) -> 4번 스위치 상태만 바꿈

// 구현 아이디어
// 1. 우선 스위치 상태를 나타내는 배열 만들어야 함
// 스위치는 1번부터 시작하니까 크기는 n + 1 해주기
// 2. 남학생 1이면, 여학생 2이면 받은 번호 확인하고 스위치 상태 배열 값 변경하기

// 한 줄에 20개씩 출력