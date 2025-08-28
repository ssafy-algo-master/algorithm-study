import java.util.Scanner;

public class BAEK_10798_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] arr = new char[5][15];
		int maxLen = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			String word = sc.next();
			if (word.length() > maxLen) {
				maxLen = word.length();
			}
			for (int j = 0; j < word.length(); j++) {
				arr[i][j] = word.charAt(j);

			}
		}//서로 길이가 다른 문장 char 배열에 받기

		//스트링빌더선언
		StringBuilder result = new StringBuilder();
		
		for(int j = 0; j < maxLen; j++) {
			for(int i = 0; i <5; i++) {
				//char 은 \0, String은 null, int 0, 
				if(arr[i][j] != '\0') {
					result.append(arr[i][j]);
					
				}
			}
		}
		
		System.out.println(result.toString());
	}// 메인종료

}
