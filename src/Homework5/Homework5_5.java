package Homework5;

public class Homework5_5 {

	public static void main(String args[]) {
		genAuthCode();
	}

	public static void genAuthCode() {

		int number = 48; // 10個數字
		int upperCase = 65; // 26個大寫英文
		int lowerCase = 97; // 26個小寫英文
		int[] random = new int[62]; // 共62個字元形成隨機陣列

		for (int i = 0; i < random.length; i++) {
			if (i <= 9) {
				random[i] = number;
				number++;
//					System.out.print(number.c);
			} else if (i > 9 && i <= 35) {
				random[i] = upperCase;
				upperCase++;
//					System.out.print(upperCase.c);
			} else {
				random[i] = lowerCase;
				lowerCase++;
//					System.out.print(lowerCase.c);
			}
		}
		for (int i = 1; i < 8; i++) {
			int randomNumber = (int) (Math.random() * 63);
			if (randomNumber <= 9) {
				System.out.print(random[randomNumber]);
			} else {
				System.out.print((char) random[randomNumber]);
			}
		}

	}
}
