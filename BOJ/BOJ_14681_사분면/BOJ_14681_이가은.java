import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// x != 0 , y != 0 임
		//1사분면
		if (x > 0 && y > 0) {
			System.out.println(1);
		}
		//2사분면
		else if (x < 0 && y > 0) {
			System.out.println(2);
		}
		//3사분면
		else if (x < 0 && y < 0) {
			System.out.println(3);
		}
		//4사분면
		else {
			System.out.println(4);
		}
	}
}