package Homework9;

class Account {
	private int deposit = 0;

	synchronized public void saving(int money) {
		while (deposit > 3000) {
			System.out.println("還剩很多錢，給我乖乖念書!!!!!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		deposit += money;
		System.out.println("媽媽存了" + money + "，帳戶共有:" + deposit);
		notify();
	}

	synchronized public void withdraw(int money) {
		while (deposit < money) {
			System.out.println("媽!!!!戶頭沒錢啦~~~ 要餓死啦!!!!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		deposit -= money;
		System.out.println("熊大領了" + money + "，帳戶共有:" + deposit);
		if (deposit < 2000) {
			System.out.println("錢有點少，該充值囉~~~~");
			notify();
		}
	}
}

class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
			for (int i = 1; i <= 10; i++)
				account.saving(2000);
	}
}

class Bear extends Thread {
	Account account;

	public Bear(Account account) {
		this.account = account;
	}

	public void run() {
			for (int i = 1; i <= 10; i++)
				account.withdraw(1000);
	}
}

public class Homework9_2 {
	public static void main(String args[]) {
		Account acc = new Account();
		Mom mom = new Mom(acc);
		Bear bear = new Bear(acc);
		mom.start();
		bear.start();
	}
}
