package Homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String args[]) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("請輸入X值:");
				int x = sc.nextInt();
				System.out.println("請輸入Y值:");
				int y = sc.nextInt();

				Calculator c1 = new Calculator(x, y);
				c1.powerXY();

				System.out.println(x + "的" + y + "次方等於" + c1.powerXY());
				sc.close();
				break;
			} catch (InputMismatchException e) {
				System.out.println("格式輸入錯誤!!!!!");
			} catch (CalException e) {
				e.printStackTrace();
			}
		}
	}
}
