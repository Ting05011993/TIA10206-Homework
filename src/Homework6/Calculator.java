package Homework6;

public class Calculator {

	private int x;
	private int y;

	public Calculator() {

	}

	public Calculator(int x, int y) throws CalException {
		if (x == 0 && y == 0)
			throw new CalException("0的0次方沒意義啦!!!");
		if (y < 0)
			throw new CalException("Y的值小於0，結果回傳不為整數");
		else
			this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int powerXY() {
		return (int) Math.pow(x, y);
	}

}
