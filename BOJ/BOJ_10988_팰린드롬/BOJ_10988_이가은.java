import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		// 회문 검사
		boolean isPalindrome = true;
		for (int i=0; i<word.length()/2; i++) {
			// 회문이 아닌 걸 발견하면 검사 중지
			if (word.charAt(i) != word.charAt(word.length()-1-i)) {
				isPalindrome = false;
				break;
			}
		}
		
		// 회문이면 1, 아니면 0 출력
		System.out.println(isPalindrome ? 1 : 0);
		sc.close();
	}
}