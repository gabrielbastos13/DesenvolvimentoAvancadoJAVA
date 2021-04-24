package br.com.desenvolvimentoAvancadoJava.MaterialAula;

import java.util.function.Consumer;

public class Consumidores {

		public static void main(String[] args) {
			
			Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
			Consumer<String> imprimirUmaFrase2 = System.out::println;
			
			imprimirUmaFrase.accept("eae men");
			imprimirUmaFrase2.accept("Hello World");		
			
		}
}
