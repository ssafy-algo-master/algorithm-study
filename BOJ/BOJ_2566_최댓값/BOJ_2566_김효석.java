import java.util.Scanner;

public class BOJ_2566_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.배열 선언
		int[][] arr = new int[9][9];
		
		
		//2.배열 입력
		for(int i =0; i < 9;i++) {
			for(int j=0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}//배열받기 종료
		
		//3.비교, 저장 선언
		int max = Integer.MIN_VALUE;
		int r = 0;
		int c = 0;
		
		
		//4.조건문 최댓값을 찾아서 맥스에 저장
		//최댓값의 행과 열을 각각의 변수에 저장
		for(int i = 0; i <9;i++) {
			for(int j = 0; j<9;j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					
					r = i;
					c = j;
				}
			}
		}//반복문 종료
		
		System.out.println(max);
		//문제에서는 행과 열을 1부터 요구
		System.out.println((r+1) + " " + (c+1));
		
		
		
	}//메인 종료

}
