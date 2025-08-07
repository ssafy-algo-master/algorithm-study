import java.util.Scanner;

public class BOJ_10988_임정인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		char[] charArr = str.toCharArray(); // 문자 배열로 변환

		boolean result = true; // 기본으로 true로 두고 조건이 안맞는 경우만 찾아서 false넣기

		for (int i = 0; i < charArr.length / 2; i++) {
			if (charArr[i] != charArr[charArr.length - 1 - i]) {
				result = false;
				break; // 하나라도 틀리면 더이상 볼 필요없음
			}
		}

		if (result) {
			System.out.println("1");

		} else {
			System.out.println("0");
		}

	}
}
