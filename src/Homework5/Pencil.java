package Homework5;

public class Pencil extends Pen {

	public void write() {
		System.out.println("削鉛筆");
	}

	public double getPrice() {
		double price = super.getPrice();
		return price * 0.8;
	}

	public Pencil(String brand, double price) {
		super(brand, price);
	}

}
