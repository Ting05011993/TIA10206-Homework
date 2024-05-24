package Homework9;

public class Homework9_1 implements Runnable {
	int counter = 1;
	private String name;

	public Homework9_1(String name) {
		this.name = name;
	}

	public void run() {
		synchronized (this) {
			while (counter <= 10) {
				System.out.println(name + "吃第" + counter + "碗");
				counter++;
				if (counter > 10) {
					System.out.println(name + "吃完囉!!!!!");
				}
				try {
					Thread.sleep((int) (Math.random() * 2501) + 500);
				} catch (Exception e) {
				}
			}
		}
	}

	public static void main(String args[]) {
		System.out.println("大胃王比賽開始囉!!!!!!!!!");
		Homework9_1 r1 = new Homework9_1("饅頭人");
		Thread t1 = new Thread(r1);
		Homework9_1 r2 = new Homework9_1("詹姆士");
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("完賽囉!!!!");
	}
}
