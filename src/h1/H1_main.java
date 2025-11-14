package h1;

public class H1_main {
	public static void main(String[] args) {
		int zone = 6;
		double price = 2.0;
		switch(zone) {
		case 6:
			price = 4.0;
			break;
		case 5:
			price = price + 0.70;
		case 3, 4:
			price = price + 0.50;
		case 2:
			price = price + 0.35;
			break;
		case 1:
			price = 2.00;
		}
		System.out.println("Der Preis beträgt: " + price + "€");
	}
}
