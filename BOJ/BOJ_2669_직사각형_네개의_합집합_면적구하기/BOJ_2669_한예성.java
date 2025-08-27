package BOJ.BOJ_2669_직사각형_네개의_합집합_면적구하기;

import java.util.Scanner;

public class BOJ_2669_한예성 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] area = new int[100][100];
		
		for(int n=0; n<4; n++) {
			int min_x = sc.nextInt();
			int min_y = sc.nextInt();
			int max_x = sc.nextInt();
			int max_y = sc.nextInt();
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					if(i>=min_x-1 && i<max_x-1 && j>=min_y-1 && j<max_y-1) {
						area[i][j]++;
					}
				}
			}
		}
		int count = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(area[i][j] >= 1) count++;
			}
		}
		System.out.println(count);
		
	}

}
