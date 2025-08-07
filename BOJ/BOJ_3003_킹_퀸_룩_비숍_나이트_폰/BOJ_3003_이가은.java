import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정상 개수 배열 저장
		int[] originCnt = {1, 1, 2, 2, 2, 8};
		
		// 입력되는 현재 개수와 정상 개수 비교, 차이 출력
		for (int i=0; i<originCnt.length; i++) {
			System.out.print(originCnt[i] - sc.nextInt() + " ");
		}
		
		sc.close();
	}
}
