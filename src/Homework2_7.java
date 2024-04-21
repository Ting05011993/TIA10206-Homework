package Homework2;

public class Homework2_7 {
	public static void main(String args[]) {
		for(char c = '\u0041'; c <= '\u0041' + 5; c++) {
			for(int i = 1; i <= c - '\u0040'; i++) {
				System.out.print(c);
			}
			System.out.println();
			System.out.println();
		}
	}

}
