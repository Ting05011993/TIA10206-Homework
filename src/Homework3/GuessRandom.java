package Homework3;

import java.util.Scanner;

public class GuessRandom {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("開始猜數字吧!!!!!!!!!");
		int random = (int)(Math.random() * 10);

		while (true) {
			int guess = sc.nextInt();
			if (guess == random) {
				System.out.println("猜對囉!!!答案就是" + guess + "!!!");
				break;
			} else {
				System.out.println("猜錯囉!!!");
			}
		}
		sc.close();
	}
}
