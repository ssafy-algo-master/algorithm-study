import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ_2309_김효석_메서드 {
	
	static int[] nineP = new int[9];//9난쟁이 처음받는 배열
	static int[] sevenP = new int[7]; //7난쟁이 뽑아서 넣을 배열
	static int N = 9;
	static int R = 7;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//아홉난쟁이의 키를 받고 정렬
		for(int i=0; i<N; i++) {
			nineP[i] = sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(nineP));
	
		Arrays.sort(nineP);
		//재귀메서드
		find7(0,0);
	}
	//idx = 9난쟁이 시작 위치, sidx = 7난쟁이 저장위치
	public static void find7(int idx, int sidx) {
		
		//종료조건
		if(sidx == R) {
			//배열 더할 썸
			int sum = 0;
			
			
			for(int i = 0; i < R; i++) {
				sum += sevenP[i];
			}
			//만약 7조합이 100이라면 해당 조합을 출력
			if(sum == 100) {
				for(int i = 0; i < R; i++) {
					System.out.println(sevenP[i]);
				}
			}
			return;
		}//종료 이프문
		
		//재귀조건
		//idx는 내가 시작하고 싶어하는 값
		for(int i = idx; i < N; i++) {
			sevenP[sidx] = nineP[i];
			find7(i+1, sidx+1);//다음 배열에 입력
		}
	}

}
