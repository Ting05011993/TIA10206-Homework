package Homework5;

public class InkBrush extends Pen {

	public void write() {
		System.out.println("沾墨汁");
	}

	public double getPrice() {
		double price = super.getPrice();
		return price * 0.9;
	}

	public InkBrush(String brand, double price) {
		super(brand, price);
	}

}
