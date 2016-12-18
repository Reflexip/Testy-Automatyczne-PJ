package pl.tau.lab01.zad2;

public class Calculator {

	private double lastResult;
	private boolean lastBooleanResult;

	public double add(double a, double b) {
		lastResult = a + b;
		return a + b;
	}

	public double sub(double a, double b) {
		lastResult = a - b;
		return a - b;
	}

	public double multi(double a, double b) {
		lastResult = a * b;
		return a * b;
	}

	public double div(double a, double b) {
		double value = 0;
		try {
			lastResult = a / b;
			value = a / b;
		} catch (ArithmeticException e) {
		}
		return value;
	}

	public boolean greater(double a, double b) {
		if (a > b) {
			lastBooleanResult = true;
			return true;
		} else {
			lastBooleanResult = false;
			return false;
		}
	}

	public double getLastResult() {
		return lastResult;
	}

	public boolean isLastBooleanResult() {
		return lastBooleanResult;
	}

}