import java.util.Scanner;

public class BOJ_2562_김소연 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[9];
		
		int max = 0;
		int max_i=-1;
		
		for(int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				max_i=i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(max_i);
		
	} // main
} // class
