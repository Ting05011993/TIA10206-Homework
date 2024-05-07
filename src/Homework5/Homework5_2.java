//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

package Homework5;

public class Homework5_2 {

	public static void randomAvg(int avg) {
		int sum = 0;
		int[] random = new int[10];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 101);
			System.out.print(random[i] + " ");
			sum += random[i];
		}
		System.out.println();
		System.out.print("平均數為:");
		avg = sum / 10;
		System.out.println(avg);
	}

	public static void main(String args[]) {
		System.out.println("開始產生亂數吧!!!!!");
		int random = (int) (Math.random() * 11);
		randomAvg(random);
	}
}