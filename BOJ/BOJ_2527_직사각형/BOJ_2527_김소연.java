import java.util.Scanner;

public class BOJ_2527_김소연 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 4;
		for(int tc = 1; tc <= T; tc++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int p1 = sc.nextInt();
			int q1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int p2 = sc.nextInt();
			int q2 = sc.nextInt();
			
		    if (p1 < x2 || p2 < x1 || q1 < y2 || q2 < y1) {
		        System.out.println("d");
		    } 
		    // 점으로 만남 (c)
		    else if ((p1==x2 && q1==y2) || 
		             (x1==p2 && q1==y2) || 
		             (p1==x2 && y1==q2) || 
		             (x1==p2 && y1==q2)) {
		        System.out.println("c");
		    } 
		    // 선분으로 만남 (b)
		    else if ((Math.max(x1, x2) < Math.min(p1, p2) && Math.max(y1, y2) == Math.min(q1, q2)) ||
		             (Math.max(x1, x2) == Math.min(p1, p2) && Math.max(y1, y2) < Math.min(q1, q2))) {
		        System.out.println("b");
		    } 
		    // 나머지 (면으로 겹침, a)
		    else {
		        System.out.println("a");
		    }

			
		}//tc for
	}
}
