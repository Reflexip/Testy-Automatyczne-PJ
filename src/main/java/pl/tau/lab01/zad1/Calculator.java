package pl.tau.lab01.zad1;

public class Calculator {

	private int lastResult;
	private boolean lastBooleanResult;
	private Class<? extends ArithmeticException> exception = null;

	public int add(int a, int b) {
		lastResult = a + b;
		return a + b;
	}

	public int sub(int a, int b) {
		lastResult = a - b;
		return a - b;
	}

	public int multi(int a, int b) {
		lastResult = a * b;
		return a * b;
	}

	public int div(int a, int b) {
		int value = 0;
		try {
			lastResult = a / b;
			value = a / b;
		} catch (ArithmeticException e) {
			setException(e.getClass());
		}
		return value;
	}

	public boolean greater(int a, int b) {
		if (a > b) {
			lastBooleanResult = true;
			return true;
		} else {
			lastBooleanResult = false;
			return false;
		}
	}

	public int getLastResult() {
		return lastResult;
	}

	public boolean isLastBooleanResult() {
		return lastBooleanResult;
	}

	public Class<? extends ArithmeticException> getException() {
		return exception;
	}

	private void setException(Class<? extends ArithmeticException> exception) {
		this.exception = exception;
	}
}