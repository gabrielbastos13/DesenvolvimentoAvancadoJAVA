package br.com.desenvolvimentoAvancadoJava.MaterialAula;

public class FuncaoAltaOrdem {

	public static void main(String[] args) {
		
		Calculo SOMA = ( a, b) -> a+b;
		Calculo SUBTRACAO = ( a, b) -> a-b;
		Calculo DIVISAO = ( a, b) -> a/b;
		Calculo MULT = ( a, b) -> a*b;
		
		System.out.println(executaOperacao(SOMA, 1,4));
		System.out.println(executaOperacao(SUBTRACAO, 5,4));
		System.out.println(executaOperacao(DIVISAO, 4,2));
		System.out.println(executaOperacao(MULT, 4,4));
	}
	
	public static int executaOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
	
}

interface Calculo {
	public int calcular(int a, int b);
}
















