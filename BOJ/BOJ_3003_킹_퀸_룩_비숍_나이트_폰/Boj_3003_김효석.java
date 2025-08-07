package day02_0805;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_체스말 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] original = { 1, 1, 2, 2, 2, 8 };
		int[] find = new int[6];
		// 6은 체스말의 수 , 찾은 체스말 수의 배열을 생성하자
		for (int i = 0; i < 6; i++) {
			find[i] = sc.nextInt();
		if(original[i] != find[i]) {
			find[i] = original[i] - find[i];
		} else {
			find[i] = 0;
		}
		System.out.print(find[i] + " ");
		}
		
		
	}

}
