

import java.util.Scanner;

public class BOJ_2753_한예성 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int ans = 0;
		if((year % 4 == 0 && year % 100 != 0)||year % 400 ==0 ) {
			ans = 1;
		}
		System.out.println(ans);
		
	}

}
