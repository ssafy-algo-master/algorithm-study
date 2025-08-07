import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2753_임정인 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 문자열 한개 입력받기
		String str = br.readLine();

		// 입력받은 문자열을 int형으로
		int num = Integer.parseInt(str);
		// 정답을 담을 변수
		int result = 0;

		if (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) {
			result = 1;
		} else {
			result = 0;
		}
		System.out.println(result);

	}

}
