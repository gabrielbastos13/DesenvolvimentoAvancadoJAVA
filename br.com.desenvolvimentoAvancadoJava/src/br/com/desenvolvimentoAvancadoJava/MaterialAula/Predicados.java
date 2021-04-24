package br.com.desenvolvimentoAvancadoJava.MaterialAula;

import java.util.function.Predicate;

public class Predicados {
	public static void main(String[] args) {
		Predicate<String> estarVazio = valor -> valor.isEmpty();
		System.out.println(estarVazio.test(""));
		System.out.println(estarVazio.test("Joao"));
		
		
	}
}
