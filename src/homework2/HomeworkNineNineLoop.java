package homework2;

public class HomeworkNineNineLoop {
	public static void main(String args[]) {

//		for + while 迴圈
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();
//		}

//		for + do while 迴圈
//		int i, j = 1;
//		for (i = 1; i <= 9; i++) {
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//			j = 1;
//		}
//		while + do while 迴圈
		int i = 1, j = 1;
		while (i <= 9) {
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
			j = 1;
		}
	}

}
