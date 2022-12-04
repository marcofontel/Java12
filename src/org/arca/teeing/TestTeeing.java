package org.arca.teeing;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTeeing {

	public static void main(String[] args) {
		//Collectors.teeing(soma, qtde, media);
		
		Double resultado = Stream.of(10,23,12,32,13,45).collect(
				Collectors.teeing(Collectors.summingDouble(i->i), Collectors.counting(), (soma,qtde)-> soma /qtde )
				);
		System.out.println(resultado);
	}
}
