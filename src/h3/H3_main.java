package h3;

public class H3_main {
	public static void main(String[] args) {
		float celsiusFloat = 14.2f, fahrenheitFloat = 1.0f;
		double celsiusDouble = 1.0, fahrenheitDouble = 2.0;
		fahrenheitFloat = (celsiusFloat * 9 / 5) + 32;
		fahrenheitDouble = (celsiusDouble * 9 / 5) + 32;
		System.out.println(fahrenheitFloat);
		System.out.println(fahrenheitDouble);
	}
}
