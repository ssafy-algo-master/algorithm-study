import java.util.Scanner;

public class BOJ_2579_김효석 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();

		int[] stairs = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			stairs[i] = sc.nextInt();
		}

		// dp 배열 생성
		int[] dp = new int[n + 1];

		// 초기값 설정: 첫 번째 계단
		dp[1] = stairs[1];

		// 두 번째 계단까지의 최댓값 계산 (n이 2 이상일 때만)
		if (n >= 2) {
			dp[2] = stairs[1] + stairs[2];
		}

		// 세 번째 계단부터 점화식 적용
		for (int i = 3; i <= n; i++) {
			int case1 = dp[i - 2] + stairs[i];
			int case2 = dp[i - 3] + stairs[i - 1] + stairs[i];
			dp[i] = Math.max(case1, case2);
		}

		// 최종 결과는 n번째 계단의 dp 값
		System.out.println(dp[n]);
		
		
		
	}
}