package Homework3;

import java.util.Scanner;

public class Lottery {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("阿文.....請輸入你討厭哪個數字?????");
		int hate = sc.nextInt();

		sc.close();

		int count = 0;

		for (int i = 1; i <= 49; i++) {
			if (i % 10 != hate && i / (hate * 10) != 1) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "數字可以選");
	}

}
