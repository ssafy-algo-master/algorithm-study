package BOJ.사분면14681;

import java.util.Scanner;

public class BOJ_14681_김소연 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//제1사분면
		if(x>0 && y>0) {
			System.out.println(1);
		}
		
		//제2사분면
		if(x<0 && y>0) {
			System.out.println(2);
		}
		
		//제3사분면
		if(x<0 && y<0) {
			System.out.println(3);
		}
		
		//제4사분면
		if(x>0 && y<0) {
			System.out.println(4);
		}
		
		sc.close();
	}
}
