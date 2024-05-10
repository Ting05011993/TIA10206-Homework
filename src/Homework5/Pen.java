package Homework5;

public abstract class Pen {
	private String brand;
	private double price;
	
	//建立空建構子
	public Pen() {
		
	}
	
	//建立屬性建構子
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
}
	
	public double getPrice() {
		return price;
	}
	
	//宣告抽象方法
	public abstract void write();
}	
	
	
	
