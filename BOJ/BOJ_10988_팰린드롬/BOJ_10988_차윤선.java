package 백준_10988_팰린드롬인지_확인하기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
//		System.out.println(result(word));

	}
	
	public static void result(String s) {
		
		// 즉시
		int len = s.length();

		for(int i = 0 ; i < len / 2; i++) {		
			// 문자 하나씩 비교
			if(s.charAt(i) != s.charAt(len-1-i)) {
				System.out.println(0);
			}
		}
		System.out.println(1);		
		
		// boolean 플래그 방식 (상태 추적)
//		boolean isPal = true; // 처음에 회문이라고 가정함
//		int len = s.length();
//		
//		for(int i = 0; i < len/2; i++) {
//			if(s.charAt(i) != s.charAt(len-1-i)) {
//				isPal = false;
//				break;
//			}
//		}
		
//		return isPal ? 1 : 0;
		
	}
	
}
