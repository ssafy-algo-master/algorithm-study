package BOJ.두수의합3273;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_3273_유규봉 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int target = sc.nextInt();
		int ans = 0;
		
		
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right) {
			int sum = arr[left] + arr[right];
			
			if(sum == target) {
				left++;
				right--;
				ans++;
			}else if(sum > target) {
				right--;
			}else {
				left++;
			}
			
		}
		
		System.out.println(ans);
	}
}
