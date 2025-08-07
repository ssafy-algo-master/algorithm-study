import java.util.Scanner;

public class BOJ_10988_김소연 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//문자열을 char 배열로
		char [] arr = str.toCharArray();
		
		int N = arr.length;
		
		boolean isPalindrome = true;
		
		//회문인지 검사
		
		for(int i = 0; i < N/2 ; i++ ) {
			if(arr[i] != arr[N-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println(isPalindrome ? 1:0);
		
	}
}
