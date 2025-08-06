import java.util.Scanner;

class Solution{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int ans = 1;
		int S = str.length();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(S-1-i)) {
				ans = 0;
				break;
			}
		}
		
		System.out.println(ans);
	}
}