package streamapi;

public class Produto {
	private String nome;
	private double valor;
	
	Produto(){}
	
	Produto(String nome, double valor){
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
	
}
