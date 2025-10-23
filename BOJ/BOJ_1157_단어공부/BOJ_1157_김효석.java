package day0924;

import java.util.Scanner;

public class BOJ_1157_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toUpperCase();
		
		//빈도수 배열
		int[] count = new int[26];
		
		//빈도수 세기
		for(int i = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);
			count[tmp - 'A']++; //A를 뺸만큼의 숫자가 배열의 인덱스 
		}
		
		int max = -1;
		char maxChar = '?';
		
		//배역 크기 순회로 최빈값 찾아서 문자 반환
		for(int i = 0; i < 26; i++) {
			if(count[i] > max) {
				max = count[i];
				maxChar = (char)(i+'A');//숫자를 다시 문자화
				
			} else if (count[i] == max) {
				maxChar = '?';
			}
		}
		
		System.out.println(maxChar);
	}

}
