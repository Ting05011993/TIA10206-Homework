package Homework1;

public class Homework1_5 {
	public static void main(String args[]) {

		// 複利公式:FV ＝ PV×（1 ＋ R）n 次方

		double FV = 1500000 * Math.pow(1.02, 10);

		System.out.println("本金加利息共" + (int) FV + "元");

	}

}
