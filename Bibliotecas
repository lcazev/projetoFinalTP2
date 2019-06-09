package classes.dados;

import java.util.ArrayList;
import java.util.List;

import classes.modelo.Biblioteca;


public class Bibliotecas {

	private ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
	
	/**
	 * Procura bibliotecas que contém um determinado livro
	 * @param livro
	 * @return
	 */
	public List<Biblioteca> getBibliotecasQuePossuemOLivro(String livro) {
		
		List<Biblioteca> bibliotecasQuePossuemOLivroPesquisado = new ArrayList<>();
		
		for (int i = 0; i < bibliotecas.size(); i++) {
			if (bibliotecas.get(i).getCatalogo().contains(livro)) {
				bibliotecasQuePossuemOLibroPesquisado.add(bibliotecas.get(i));
			} 
		}
		return bibliotecasQuePossuemOLivroPesquisado;
	}

	public void adicionarBiblioteca(Biblioteca biblioteca) {
		bibliotecas.add(biblioteca);
	}
	
}
