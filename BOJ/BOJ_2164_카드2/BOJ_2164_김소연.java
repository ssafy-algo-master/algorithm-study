// 카드2
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class BOJ_2164_김소연 {
	static int result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> q = new ArrayDeque<>();
		//카드 순서대로 쌓기
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		while(q.size()>1) {
			q.poll(); //제일 위에 있는 카드 버리기
			q.add(q.poll()); //그다음 위에 있는 카드 큐 꺼내서 맨 뒤에 넣기
		}
		System.out.println(q.peek());
	}//main
}//class

