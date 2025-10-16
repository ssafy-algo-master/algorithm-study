import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class BOJ_1158_요세푸스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 큐를 생성하고 1부터 N 입력
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        // 제거된 숫자 저장 리스트
        ArrayList<Integer> result = new ArrayList<>();

        //빈다면 멈춰
        while (!q.isEmpty()) {
            
            for (int i = 0; i < K - 1; i++) {
                int first = q.poll(); // 맨 앞 요소를 꺼내기
                q.add(first);       // 맨 뒤에 추가
            }

            // K번째 요소를 큐에서 제거 & 결과 리스트에 추가
            result.add(q.poll());
        }

        //스트링 빌더에 숫자 더하기
        StringBuilder sb = new StringBuilder();
        sb.append("<"); // 맨 앞에 '<' 추가

        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i)); // 리스트에서 숫자를 하나씩 추가
            
            // 마지막 아닐때까지 , 넣기
            if (i < result.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(">"); // 맨 뒤에 '>' 
        System.out.println(sb.toString());
        sc.close();
    }
}