package Homework4;

import java.util.Scanner;

public class Homework4_4 {

	public static void main(String args[]) {

		int[][] lend = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		Scanner sc = new Scanner(System.in);
		System.out.println("你要借多少錢??????");
		int lendAmount = sc.nextInt();
		sc.close();

		int count = 0;
		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < lend.length; i++) {
			for (int j = 0; j < lend[i].length; j++) {
				if(lend[i][j] >= lendAmount) {
					System.out.print(lend[0][j] + " ");;
					count++;
				}
			}
		}
		System.out.println("共" + count + "人");
	}
}
