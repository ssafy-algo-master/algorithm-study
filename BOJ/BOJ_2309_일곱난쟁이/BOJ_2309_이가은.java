
import java.util.Scanner;

public class BOJ_2309_이가은 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] hArr = new int[9];
		
		int total = 0;
		for (int i=0; i<9; i++) {
			hArr[i] = sc.nextInt();
			total += hArr[i];
		}
		// 버블 정렬
		for (int i=0 ; i<9-1; i++) {
			for (int j=0; j<9-1-i; j++) {
				if (hArr[j] > hArr[j+1]) {
					int temp = hArr[j];
					hArr[j] = hArr[j+1];
					hArr[j+1] = temp;
				}
			}
		}
		
		int f1 = 0;            
		int f2 = 0;
		loop:
		for (int i=0; i<hArr.length-1; i++) {
			for (int j=1; j<hArr.length; j++) {
				if (total - hArr[i] - hArr[j] == 100) {
					f1 = i;
					f2 = j;
					break loop;
				}
			}
		}
		
		for (int i=0; i<9; i++) {
			if (i != f1 && i != f2)
				System.out.println(hArr[i]);
		}
		
		sc.close();
	}
}