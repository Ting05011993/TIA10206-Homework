package Homework1;

public class Homework1_6 {
	public static void main(String args[]) {
		int i = 5;
		char c = '5';
		String s = "5";

		System.out.println(i + i); // 兩者皆為數值,故答案相加為10
		System.out.println(i + c); // '5'為一字元單位,經查詢ASCII表顯示該字元值為53,故兩數值相加為5+53=58
		System.out.println(i + s); // "5"為字串,另加號為連接符號,故兩者相連顯示為55
	}

}
