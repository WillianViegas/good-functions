package funcs;

import exceptions.DivisaoPorZeroException;

public class IntFunctions {

	public static int somar(int a, int b) {
		return a + b;
	}

	public static int subtrair(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static double dividir(double a, double b) {
		try {
			return a / b;			
		}
		catch(ArithmeticException e) {
			throw new DivisaoPorZeroException(e.getMessage());
		}
	}
	
	public static double restoDivisao(double a, double b) {
		return a % b;
	}
}
