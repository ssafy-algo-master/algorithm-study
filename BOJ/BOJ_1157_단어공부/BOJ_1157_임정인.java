package boj.단어공부1157;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BOJ_1157_임정인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			c = Character.toUpperCase(c);
			// map에 c가 이미 있는지 없는지 확인
			// 이미 있으면 그 값 꺼내서 +1해주고 다시 put
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} // map에 없으면 그냥 put(키, 1) 처음 추가
			else {
				map.put(c, 1);
			}

		}
		// 모두 map에 넣었으면 갯수 확인하기
		int max = 0; // 최대 등장한 값
		char answer = '?';

		// <키-값> 쌍을 모아둔 집합을 반환하는 map.entrySet()이라는 함수를 사용해보자
		// 그러기 위해 entryset을 선언해보자
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			char key = entry.getKey();
			int value = entry.getValue();

			if (value > max) {
				max = value;
				answer = key;
			} // 값이 같은(알파벳 사용 수가 같은) 알파벳이 있으면 ?
			else if (value == max) {
				answer = '?';

			}

		}
		System.out.println(answer);

	}

}
