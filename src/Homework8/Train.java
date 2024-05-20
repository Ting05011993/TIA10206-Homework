package Homework8;

import java.util.Objects;

public class Train {
	private int number;
	private String type, start, dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void setTrain(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNum() {
		return number;
	}
	
	public String getType() {
		return type;
	}
	
	public String getStart() {
		return start;
	}
	
	public String getDest() {
		return dest;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return(this.getNum() + "," + this.getType() + "," + this.getStart() + "," + this.getDest() + "," + this.getPrice()) ;
	}

	

}
