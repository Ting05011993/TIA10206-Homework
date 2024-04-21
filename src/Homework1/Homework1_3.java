package Homework1;

public class Hoemwork1_3 {
	public static void main(String args[]) {
		int days = 256559 / 60 / 60 / 24;
		int hours = 256559 / 60 / 60 % 24;
		int mins = 256559 / 60 % 60;
		int secs = 256559 % 60;
		
		System.out.println("256559秒共" + days + "天" + hours + "小時" + mins + "分" + secs + "秒");
		
	}

}
