package org.arca.ident;

public class TestIdent {
	
	public static void main(String[] args) {
		String texto = "Ola \neste um exemplo de \nmetodo string";
		texto.indent(4);
		
		texto = texto.transform(a-> new StringBuilder(a).reverse().toString());
		
		System.out.println(texto);
	}

}
