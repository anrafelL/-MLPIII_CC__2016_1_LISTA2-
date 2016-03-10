package br.unipe.mlpIII.modelo;

public class Fita {

	protected String titulo;
	protected double preco;
	protected Categoria categoria;
	protected Autor autor;
	
	public Fita(String titulo, double preco, Categoria categoria, Autor autor) {
		this.titulo = titulo;
		this.preco = preco;
		this.categoria = categoria;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void porcentagem() {			
	}
	
	public String toString() {
		return "Titulo: "+titulo+" preco: "+preco+" categoria: "+categoria;
	}
	
	
}
