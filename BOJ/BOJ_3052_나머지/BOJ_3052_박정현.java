package BOJ_04_1차원배열;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3052 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 배열을 만든다.
		int[] arr = new int[10];
		
		HashSet<Integer> set = new HashSet<>();
		
		// 배열에 값을 넣는다.
		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
			set.add(arr[i] % 42);
		}
		
		System.out.println(set.size());
		
	} // main

} // class
