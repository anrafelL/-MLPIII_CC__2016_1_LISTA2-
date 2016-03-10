package br.unipe.mlpIII.modelo;

public class Fitalancamento extends Fita {

	
	public Fitalancamento(String titulo, double preco, Categoria categoria, Autor autor) {
		super(titulo, preco, categoria,autor);
	}
	
	public void porcentagem() {
		preco = preco + (preco * 0.2);
	}
}
