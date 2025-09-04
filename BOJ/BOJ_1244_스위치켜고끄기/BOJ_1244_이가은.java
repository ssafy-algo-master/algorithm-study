
import java.util.Scanner;

public class BOJ_1244_이가은 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		int studentN = sc.nextInt();
		for (int i=0; i<studentN; i++) {
			int gender = sc.nextInt();
			
			// 남자
			if (gender == 1) {
				int switchN = sc.nextInt();
				for (int j=switchN-1; j<N; j+=switchN) {
					change(arr, j);
				}
			}
			// 여자
			else {
				int switchN = sc.nextInt()-1;
				change(arr, switchN);
				for (int j=1; j<N; j++) {
					if (switchN-j >=0 && switchN+j <= N-1) {
						if (arr[switchN-j] == arr[switchN+j]) {
							change(arr, switchN-j);
							change(arr, switchN+j);
						}
						else
							break;
					}
					else
						break;
				}
			}
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(arr[i] + " ");
			
			if ((i+1)%20 == 0)
				System.out.println();
		}
		sc.close();
	}
	
	public static void change(int[] arr, int index) {
		if (arr[index] == 1)
			arr[index] = 0;
		else
			arr[index] = 1;
	}
}

