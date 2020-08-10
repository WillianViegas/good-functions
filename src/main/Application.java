package main;

import static funcs.CoinFunctions.retornaValorComJuros;
import static funcs.DateFunctions.retornaADataDeHoje;
import static funcs.DateFunctions.retornaADataNoPadraoBR;
import static funcs.DateFunctions.retornaDataComDiferencaDias;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import funcs.DateFunctions;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello world");
		
		System.out.printf("Valor com juros: %.2f \n", retornaValorComJuros(100, 20));
		
		System.out.println(retornaADataDeHoje());
		
		Date date = DateFunctions.retornaAStringEmData("06/08/2020 15:00:00");
		System.out.println(retornaADataNoPadraoBR(date));
		
		System.out.println(retornaADataNoPadraoBR(retornaDataComDiferencaDias(new Date(), 3)));
		
		System.out.println(DateFunctions.verificarDiaSemana(new Date(), 2));
		
		System.out.println(DateFunctions.verificaMes(new Date(), 8));
	}
}
