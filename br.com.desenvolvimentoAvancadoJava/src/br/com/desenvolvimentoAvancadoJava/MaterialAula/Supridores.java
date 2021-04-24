package br.com.desenvolvimentoAvancadoJava.MaterialAula;

import java.util.function.Supplier;

public class Supridores {
	public static void main(String[] args) {
		Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
		System.out.println(instanciaPessoa.get());
		
	}
	

}

class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		nome = "João";
		idade = 23;
	}
	public String toString() {
		return String.format("nome: %s, idade: %d", nome, idade);
	}
	
}













