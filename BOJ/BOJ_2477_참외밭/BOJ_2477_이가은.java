import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2477_이가은 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int K = sc.nextInt();
		int[][] arr = new int[5][2];
		List<Integer> list = new ArrayList<>();
		
		for (int i=0; i<6; i++) {
			int dir = sc.nextInt();
			int len = sc.nextInt();
			
			if (arr[dir][0] == 0)
				arr[dir][0] = len;
			else
				arr[dir][1] = len;
			
			list.add(len);
		}
		
		int bigRow = Integer.MIN_VALUE;
		int bigCol = Integer.MIN_VALUE;
		int smallRow = Integer.MAX_VALUE;
		int smallCol = Integer.MAX_VALUE;
		// 1/2 중에서 가장 큰 변 구하기
		for (int i=1; i<=2; i++) {
			for (int j=0; j<2; j++) {
				bigRow = Math.max(bigRow, arr[i][j]);
			}
		}
		// 3/4 중에서 가장 큰 변 구하기
		for (int i=3; i<=4; i++) {
			for (int j=0; j<2; j++) {
				bigCol = Math.max(bigCol, arr[i][j]);
			}
		}
		
		// 작은 사각형 변 구하기 (가장 큰 변 모두 지난 후 부터 2, 3번째)
		int idx = 0;
		int cnt = 0;
		while(true) {
			if (list.get(idx) == bigCol || list.get(idx) == bigRow) {
				cnt += 1;
			}
			else {
				cnt = 0;
			}
			
			if (cnt == 2) {
				smallRow = list.get((idx+2)%6);
				smallCol = list.get((idx+3)%6);
				break;
			}
			
			idx += 1;
			idx = idx%6;
		}
		
		
		int result = (bigRow*bigCol - smallRow*smallCol ) * K;
		System.out.println(result);
		
		sc.close();
	}
}


