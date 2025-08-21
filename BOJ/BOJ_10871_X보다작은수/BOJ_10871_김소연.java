import java.util.Scanner;

public class BOJ_10871_김소연 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //정수 N개로 이루어진 수열
		int X = sc.nextInt(); //수열 A를 이루는 정수 N개
		
		//X보다 작은 수는 적어도 하나 존재
		int [] arr = new int[N];
		for(int i=0; i < N; i++) {
			arr[i] = sc.nextInt(); //수열 채워넣기
			//X보다 작은 것만 출력
			if(arr[i]<X) {
				System.out.print(arr[i] + " ");
			}//if
		} // for
	} // main
} // class
