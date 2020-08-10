package main;

import static funcs.CoinFunctions.retornaValorComJuros;
import static funcs.DateFunctions.retornaADataDeHoje;
import static funcs.DateFunctions.retornaADataNoPadraoBR;
import static funcs.DateFunctions.retornaDataComDiferencaDias;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import funcs.CoinFunctions;
import funcs.DateFunctions;
import funcs.IntFunctions;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello world");
		
		System.out.printf("Valor com juros: %.2f \n", retornaValorComJuros(100, 20));
		
		System.out.println(retornaADataDeHoje());
		
		Date date = DateFunctions.retornaAStringEmData("06/08/2020 15:00:00");
		System.out.println(retornaADataNoPadraoBR(date));
		
		System.out.println(retornaADataNoPadraoBR(retornaDataComDiferencaDias(new Date(), 3)));
		
		System.out.println(DateFunctions.verificarDiaSemana(new Date(), 2));
		
		System.out.println(DateFunctions.verificaMes(new Date(), 8));
		
		System.out.println(CoinFunctions.retornaOValorComCambio(20.00, 5.39));
		
		System.out.println(IntFunctions.somar(10, 2));
		
		System.out.println(IntFunctions.subtrair(10, 2));
		
		System.out.println(IntFunctions.multiplicar(10, 2));
		
		System.out.println(String.format("%.2f", IntFunctions.dividir(10, 3)));
		
		System.out.println(IntFunctions.restoDivisao(4, 2));
		
		System.out.println(CoinFunctions.retornaOValorParcelado(2000.00, 5));
		
		System.out.println(CoinFunctions.retornaOValorParcelado(2000.00, 5, 10));
	}
}
