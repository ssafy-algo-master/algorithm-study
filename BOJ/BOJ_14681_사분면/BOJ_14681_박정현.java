package BOJ;

import java.util.Scanner;

public class BOJ_14681_박정현 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if (x > 0) {
			if (y > 0) {
				System.out.println(1);
			}
		}
		
		if (x > 0) {
			if (y < 0) {
				System.out.println(4);
			}
		}
		
		if (x < 0) {
			if (y > 0) {
				System.out.println(2);
			}
		}
		
		if (x < 0) {
			if (y < 0) {
				System.out.println(3);
			}
		}
	} // main
} // class
