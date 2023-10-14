package Problem2;

import java.util.Scanner;

public class testTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		
		
		
		starTriangle star = new starTriangle(k);
		
		
		System.out.println(star.toString());
	
	}
}
