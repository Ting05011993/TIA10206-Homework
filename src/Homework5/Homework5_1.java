package Homework5;

import java.util.Scanner;

public class Homework5_1 {

	public static void starSquare(int width, int height) {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入高度");
		int width = sc.nextInt();
		System.out.println("請輸入寬度");
		int height = sc.nextInt();
		sc.close();
		
		starSquare(width, height);
	}
}
