import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2164_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 카드의 갯수
		int N = sc.nextInt();
		// 카드들
		Queue<Integer> cards = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			cards.add(i);
		}
		// System.out.println(cards);

		// 마지막 단어 저장 리스트
		ArrayList<Integer> last = new ArrayList<>();
		while (!cards.isEmpty()) {
			// 1이면 그냥 출력
			if (N == 1) {
				last.add(1);
			}
			cards.poll();// 맨위 뽑기(맨유 아님)
			cards.add(cards.poll());// 그다음은 맨 뒤로 옮긴다.
			// 큐에 마지막 하나만 남으면 리스트에 넣는다.
			if (cards.size() == 1) {
				last.add(cards.poll());
			}
		}

		System.out.println(last.get(0));

	}

}
