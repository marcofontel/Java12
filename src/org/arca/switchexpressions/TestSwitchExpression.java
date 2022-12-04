package org.arca.switchexpressions;

import java.util.Scanner;

public class TestSwitchExpression {

	public static void main(String[] args) {
		System.out.println("Digite o dia da semana: ");
		
		Scanner input = new Scanner(System.in);
		String dia = input.nextLine();
		
		input.close();
		String resultado;
		
		switch (dia) {
			case "segunda":
				resultado = "dia útil";
				break;
			case "terça":
				resultado = "dia útil";
				break;	
			case "quarta":
				resultado = "dia útil";
				break;	
			case "quinta":
				resultado = "dia útil";
				break;	
			case "sexta":
				resultado = "dia útil";
				break;	
			case "sabado":
				resultado = "final de semana";
				break;		
			default: 
				resultado = "Dia Invalido";
		}
		System.out.println(resultado);
	}
}
