package BOJ.윤년2753;

import java.util.Scanner;

public class BOJ_2753_김소연 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y  = sc.nextInt();
		int result = 0;
		
		if ((y % 4 == 0) && (y % 100 !=0)) {
			result = 1;
		} else if ((y % 4 == 0) && (y % 400 == 0)) {
			result = 1;
		} else
			result = 0;
		
		System.out.println(result);
	}
}
