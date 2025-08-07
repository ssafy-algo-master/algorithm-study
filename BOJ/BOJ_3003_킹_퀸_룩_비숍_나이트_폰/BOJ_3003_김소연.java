import java.util.Scanner;

public class BOJ_3003_김소연 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr1 = new int[6];
		
		// 동혁이가 발견한 흰색 피스
		for(int i = 0; i <6 ; i++) {
			arr1[i] = sc.nextInt();
		}
		
		//완전한 체스말
		int [] arr2 = {1, 1, 2, 2, 2, 8};
		
		//더하거나 빼야 되는 체스말
		int[] result = new int[6];
		for(int i = 0; i < 6 ; i++) {
			result[i] = arr2[i] - arr1[i];
			System.out.print(result[i] + " ");
		}
		
			
	}
}
