

import java.util.Scanner;

public class BOJ_14861_한예성 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int ans = 0;
		
		if(r > 0 && c > 0) {
			ans = 1;
		} else if(r < 0 && c > 0) {
			ans = 2;
		} else if(r < 0 && c < 0) {
			ans = 3;
		} else if(r > 0 && c < 0) {
			ans = 4;
		}
		System.out.println(ans);
	}
}
