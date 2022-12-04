package org.arca.mismatch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestMismatch {
	
	public static void main(String[] args) {
		String ex1 = "ex1.txt";
		String ex2 = "ex2.txt";
		String texto = "Texto do arquivo 2";
		
		try{
			Files.writeString(new File(ex2).toPath(), texto);
			} catch (IOException e) {
				
		}
	}
}
