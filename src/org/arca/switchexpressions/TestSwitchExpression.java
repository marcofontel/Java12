package org.arca.switchexpressions;

import java.util.Scanner;

public class TestSwitchExpression {

	public static void main(String[] args) {
		System.out.println("Digite o dia da semana: ");
		
		Scanner input = new Scanner(System.in);
		String dia = input.nextLine();
		
		input.close();
		String resultado;
		
		resultado = switch(dia) {
			case "segunda" -> "dia util";
			case "terça" -> "dia util";
			case "quarta" -> "dia util";
			case "quinta" -> "dia util";
			case "sexta" -> "dia util";
			case "sabado" -> "final de semana";
			case "domingo" -> "final de semana";
			default -> "dia invalido";

		};
		System.out.println(resultado);
	}
}
