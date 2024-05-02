package Homework4;

public class Homework4_3 {

	public static void main(String args[]) {

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';

		for (int k = 0; k < planet.length; k++) {

			String stringPlanet = planet[k];

			for (int j = 0; j < stringPlanet.length(); j++) {
				char check = stringPlanet.charAt(j);
				if (check == a || check == e || check == i || check == o || check == u) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}