import java.util.Scanner;

public class BOJ_9095_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			int[] nums = {1,2,3};
			
			int n = sc.nextInt();
			
			//동적 영어로 뭐였지
			int[] r = new int[n+1];
			r[0] = 1;
			
			for(int i = 1; i <= n; i++) {
				//nums에 대해 반복
				for(int num : nums) {
					//(i-num)위치해서 num만큼 이동해 i로 오는 경우
					if(i-num >= 0) {
						r[i] += r[i-num];
					}
				}
			}
			System.out.println(r[n]);
			
		}

	}

}
