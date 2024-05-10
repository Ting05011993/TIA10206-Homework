package Homework5;

public class PenPoly {

	public static void main(String args[]) {

		Pen p1 = new Pencil("Lion", 10);
		Pen p2 = new InkBrush("Montblanc", 10000);

		p1.write();
		System.out.print(p1.getBrand() + " ");
		System.out.println(p1.getPrice());
		
		p2.write();
		System.out.print(p2.getBrand() + " ");
		System.out.println(p2.getPrice());
	}

}
