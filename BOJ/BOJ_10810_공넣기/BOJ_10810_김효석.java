package algostudy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10810_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N은 박스의 크기
		int N = sc.nextInt();
		int[] box = new int[N];
		//M은 문장횟수(반복)
		int M = sc.nextInt();
		for(int tc = 1; tc <= M; tc++) {
			//x는 시작 숫자, y는 끝숫자, z는 넣는 공의 번호
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			int z = sc.nextInt();
		//위 반복문에서 각 줄이 차례대로 바뀜 >> 조건에 맞춰 한줄씩 x~y에 z값을 넣는 작업
			//차례대로 수행되므로 따로 빼는 작업 없이 넣기만 하면 나중에 넣은 공의 번호만 남는다.
		for(int tc2 = x; tc2 <= y; tc2++) {
			box[tc2 - 1] = z;
		
		}
		
	}//Arrays.toString을 쓰면 []나오므로 반복문으로 출력
		for(int i = 0; i < box.length; i++) {
			System.out.print(box[i] + " ");
		}
}
}