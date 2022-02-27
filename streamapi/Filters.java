package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto("Chinelo", 21.25);
		Produto p2 = new Produto("Chinelo", 250.25);
		Produto p3 = new Produto("Bolsa", 215.25);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		
		Predicate<Produto> barato = p -> p.getValor() <= 100;
		Predicate<Produto> nomeProduto = p -> p.getNome().equalsIgnoreCase("chinelo");
		
		Function<Produto, String> converteObjToString = p -> p.getNome(); 

		produtos.stream()
			.filter(nomeProduto)
			.filter(barato)
			.map(converteObjToString)
			.forEach(System.out::println);
	}

}
