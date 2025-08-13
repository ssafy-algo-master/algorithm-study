package SWEA_21936.길이가_M인_회문_찾기;

import java.util.Scanner;

public class SWEA_21936_유규봉 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for(int t = 1; t <= tc; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			String str = sc.next();
			
			// 모든 인덱스에서 회문인지 검색
			String result = "NONE";
			for(int i = 0; i <= N - M; i++) {
				String s = str.substring(i, i+M);
				String reverse = new StringBuilder(s).reverse().toString();
				
				if(s.equals(reverse)) {
					result = s;
					break;
				}
			}
			
			System.out.println("#" + t + " " + result);
			
		}
	}

}
