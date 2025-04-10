package main;

public class Chia {
	public static String tinh(double a, double b) {
		if (b == 0) {
			return "Không thể chia cho 0";
		}
		return String.valueOf(a / b);
	}
}