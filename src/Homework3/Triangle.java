package Homework3;

import java.util.Scanner;

public class Triangle {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入三個數字");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		sc.close();

		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			if (side1 == side2 && side2 == side3) {
				System.out.println("這是正三角形");
			} else if (side1 == side2 || side1 == side3 || side2 == side3) {
				System.out.println("這是等腰三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}
}
