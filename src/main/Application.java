package main;

import static funcs.CoinFunctions.retornaValorComJuros;
import static funcs.DateFunctions.retornaADataDeHoje;

import java.util.Date;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello world");
		
		System.out.printf("Valor com juros: %.2f \n", retornaValorComJuros(100, 20));
		
		System.out.println(retornaADataDeHoje(new Date()));
	}
}
