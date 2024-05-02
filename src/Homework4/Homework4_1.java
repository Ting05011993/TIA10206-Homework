package Homework4;

import java.util.Arrays;

public class Homework4_1 {

	public static void main(String args[]) {

		int[] Array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(Array);

		int sum = 0;

		for (int i = 0; i < Array.length; i++) {
			sum += Array[i];
		}

		int average = sum / Array.length;

		System.out.println("平均值等於" + average);

		System.out.print("大於平均值的有");
		for (int j = 0; j < Array.length; j++) {
			if (Array[j] > average) {
				System.out.print(Array[j] + " ");
			}
		}

	}

}
