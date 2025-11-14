package p2;

public class P2_main {
	public static void main (String[] args) {
		int a = 3,b = 5,c = 6;
		int intResult = 0;
		double x = 1.5, y = 2.3;
		double doubleResult = 3;
		switch (intResult) {
		case 1:
			intResult = c - a * 3;
			System.out.println(intResult);
			break;
		case 2:
			intResult = c / b;
			System.out.println(intResult);
			break;
		case 3:
			intResult = a + b / c;
			System.out.println(intResult);
			break;
		}
		if (doubleResult == 1) {
			doubleResult = c / b;
			System.out.println(doubleResult);
		} if (doubleResult == 2) {
			doubleResult = c + a / b;
			System.out.println(doubleResult);
		} if (doubleResult == 3) {
			doubleResult = x + y * b;
			System.out.println(doubleResult);
		}
	}
}
