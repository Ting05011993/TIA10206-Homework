package Homework4;

import java.util.Scanner;

public class Homework4_5 {

	public static void main(String args[]) {
		int[] normalYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] leapYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入年:");
		int year = sc.nextInt();
		if(year < 1900 || year > 2500) {
			System.out.println("請重新輸入");
		}
		
		System.out.println("月:");
		int month = sc.nextInt();
		if(month < 1 || month > 12) {
			System.out.println("請重新輸入");
		}

		System.out.println("日:");
		int date = sc.nextInt();
		if(date < 0 || date > normalYear[month - 1] || date > leapYear[month -1]) {
			System.out.println("請重新輸入");
		}
		sc.close();

		int sumMonth = 0;
		int sumTotal = 0;

		if (year % 4 == 0) {
			for (int i = 0; i < (month - 1); i++) {
				sumMonth += leapYear[i];
				sumTotal = sumMonth + date;
			}
		} else {
			for (int i = 0; i < (month - 1); i++) {
				sumMonth += normalYear[i];
				sumTotal = sumMonth + date;
			}
		}
		System.out.println("輸入的日期為該年第" +sumTotal + "天");
	}
}
