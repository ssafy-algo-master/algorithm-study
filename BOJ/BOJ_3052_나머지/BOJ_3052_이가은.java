import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_3052_이가은 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> setRes = new HashSet<>();
		for (int i=0; i<10; i++) {
			int n = sc.nextInt();
			setRes.add(n%42);
		}
		
		System.out.println(setRes.size());
		sc.close();
	}
}
