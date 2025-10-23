import java.util.Scanner;

public class BOJ2805_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 나무의 수
		int M = sc.nextInt(); // 가져가야하는 나무의 길이
		
		
		int[] trees = new int[N]; //나무마다의 높이를 입력할 배열
		
		int maxT = 0; // 나무 최대 높이
		int minT = 0; // 나무 최소 높이 이진 탐색하려면 필요하다.
		
		//나무 입력 & 최대 높이 구하기
		for(int i = 0; i < N; i++) {
			trees[i] = sc.nextInt();
			if(trees[i] > maxT) {
				maxT = trees[i];
			}
		}
		
		//절단기 범위
		int max_h = maxT;
		int min_h = 0;
		int result_h = 0; //M 이상을 만족하는 최대 높이
		
		//max -- , min ++ 해서 이진 탐색
		while(min_h <= max_h) {
			int mid_h = (min_h + max_h)/2; //중간높이로 잘라보자
			long sumT = 0; // 잘라진 나무 합(int가 안된다네)
			
			//중간 길이로 잘랐을때 총합
			for(int tree : trees) {
				if(tree > mid_h) { //절단기보다 높으면
					sumT += (tree - mid_h); //잘린만큼 더해
				}
			}
			
			
			// 합이 M이상이면 ? 최소길이를 중간값 + 1로 바꿔서 한번 더 해보자
			// M 미만이면 최대길이를 중간값 -1바꿔서 해보자
			if(sumT >=M) {
				result_h = mid_h;//여기가 계속 갱신
				min_h = mid_h+1;
			} else {
				max_h = mid_h -1 ;
			}
			}
			
			
			System.out.println(result_h);
			
			
	}

}
