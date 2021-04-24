package br.com.desenvolvimentoAvancadoJava.MaterialAula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

	public static void main(String[] args) {
		
			String[] nomes = {"Joao", "Paulo ", "Joao", "Vitor"};
			Integer[] numeros = {1, 2, 3, 4, 5};
			imprimirNomesFiltrados(nomes);
			imprimirTodosOsNomes(nomes);
			imprimirODobroDeCadas(numeros);
			
			List<String> profissoes = new ArrayList<>();
			profissoes.add("Caminhoneiro");
			profissoes.add("Motoboy");
			profissoes.add("Taxista");
			profissoes.add("Motorista de Bitrem");
			profissoes.add("Motorista de Rodotrem");
			
			profissoes.stream()
						.filter(profissao -> profissao.startsWith("Motorista"))
						.forEach(System.out::println);
			
			
		}
		
		public static void imprimirNomesFiltrados(String... nomes) {
			
			String nomesParaImprimirDaStream = Stream.of(nomes)
					.filter(nome -> nome.equals("Joao"))
					.collect(Collectors.joining());
			
			System.out.println("Nomes da stream: "+nomesParaImprimirDaStream);
			
		}
		
		public static void imprimirTodosOsNomes(String... nomes) {
			Stream.of(nomes)
				.forEach(nome -> System.out.println(nome));
		}
		
		public static void imprimirODobroDeCadas(Integer...numeros) {
			
			Stream.of(numeros).map( numero -> numero*2).forEach(System.out::println);
			
		}
		
	}







