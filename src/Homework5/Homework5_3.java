//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳

package Homework5;

public class Homework5_3 {

	public int maxElement(int x[][]) {
		int intMax = 0;
		for (int i = 0; i < x.length; i++) {
			intMax = x[0][0];
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > intMax) {
					intMax = x[i][j];
				}
			}
		}
		return intMax;
	}

	public double maxElement(double x[][]) {
		double doubleMax = 0;
		for (int i = 0; i < x.length; i++) {
			doubleMax = x[0][0];
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > doubleMax) {
					doubleMax = x[i][j];
				}
			}
		}
		return doubleMax;
	}

	public static void main(String args[]) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		Homework5_3 h = new Homework5_3();
		System.out.println(h.maxElement(intArray));
		System.out.println(h.maxElement(doubleArray));
	}
}
