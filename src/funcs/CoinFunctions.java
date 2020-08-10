package funcs;

public class CoinFunctions {

	public static double retornaValorComJuros(double valor,  double juros) {
		double resultado = ((juros/ 100.0) * valor) + valor;
		return resultado;
	}
	
	public static double retornaOValorComCambio(double valor, double moeda) {
		double resultado = valor * moeda;
		return resultado;
	}
}
