package homework2;

public class Homework2_5 {
	public static void main(String args[]) {
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i / 40 == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("可以選擇的數字:" + count + "個");
	}
}