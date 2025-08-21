//도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
//바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
//도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
//공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
package 입출력과사칙연산;

import java.util.Scanner;

public class MyBOJ_10813 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// 바구니 수
		int N = scanner.nextInt();
		// 교환 횟수
		int M = scanner.nextInt();
		
		// i번째 바구니에 i가 들어가 있다.
		// N+1인 이유 : 배열을 1부터 N번까지 사용하기 위해서 (0번은 안씀)
		int[] basket = new int[N+1];
		
		// 초기 상태를 설정 (1번 바구니에 1번 공 ...)
		for(int i = 1; i <= N; i++) {
			basket[i] = i;
		}
		
		// M번 반복하면서, 각 줄에 주어지는 두 바구니 번호(i, j)를 받는다.
		for (int k = 0; k < M; k++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			
		// 두 바구니 안의 공을 서로 교환한다.
		// 교환은 임시 변수 temp를 사용해서 안전하게 처리한다.
			int temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
		}
		
		for (int i = 1; i <=N; i++) {
			System.out.print(basket[i] + " ");
		}
		
		
	}
}
