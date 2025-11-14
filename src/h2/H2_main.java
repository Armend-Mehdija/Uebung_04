package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x = true, y = true, a = true, b = true, c = true;
		int input = 10;
		switch(input) {
		case 10:
			x = true;
			y = false;
			break;
		case 11:
			x = true;
			y = true;
			break;
		case 0:
			x = false;
			y = false;
		    break;
		case 1:
			y = true;
			x = false;
			break;
			}
		if (x == true && y == true) {
			a = true;
		} else {
			a = false;
		}
		if (x == true || x != y) {
			b = true;
		} else {
			b = false;
		}
		if (x == true && y == true) {
			c = false;
		} if (x == true && y == false) {
			c = true;
		} if (x == false && y == true) {
			c = false;
		} if (x == false && y == false) {
			c = true;
		}
		System.out.println("x ist " + x);
		System.out.println("y ist " + y);
		System.out.println("a ist " + a);
		System.out.println("b ist " + b);
		System.out.println("c ist " + c);
	}	
}
