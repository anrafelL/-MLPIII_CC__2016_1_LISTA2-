package br.unipe.mlpIII.ui;

import java.util.Scanner;

import br.unipe.mlpIII.modelo.Autor;
import br.unipe.mlpIII.modelo.Categoria;
import br.unipe.mlpIII.modelo.Fita;
import br.unipe.mlpIII.modelo.Fitainfantil;
import br.unipe.mlpIII.modelo.Fitalancamento;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe se a fita e um lancamento ou se e infantil: ");
		System.out.println("1 - Lancamento\n2 - Infantil ");		
			int cont = scan.nextInt();	
		if (cont == 1) {
			Autor autor = new Autor("Robert Eggers");
			Fita fita = new Fitalancamento("A Bruxa", 20.0, Categoria.Terror, autor);
			fita.porcentagem();
			System.out.println(fita);
		}else {
			Autor autor = new Autor("John Lasseter");
			Fita fita = new Fitainfantil("Toy Story", 20.0, Categoria.Aventura, autor);
			fita.porcentagem();
			System.out.println(fita);
		}		
	}
}
