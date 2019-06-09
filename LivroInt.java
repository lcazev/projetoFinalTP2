package classes.interacao;

import java.util.List;

import classes.Sistema;
import classes.modelo.Biblioteca;

public class LivroInt {
	
	public static void buscarLivro() {
		System.out.println("Bem-vindo(a)! Digite o titulo do livro que deseja pedir:");
		Sistema.entrada.nextLine();
		String titulo = Sistema.entrada.nextLine();
		
		obterLivroPorTitulo(titulo);
	}

	private static void obterLivroPorTitulo(String livro) {
		
		List<Biblioteca> encontradas = Sistema.bibliotecas.getBibliotecasQuePossuemOLivro(livro);
		
		boolean livroNaoEncontrado = encontradas == null;
		
		if(livroNaoEncontrado) {
			System.out.println("Livro nao encontrado. Redirecionando para pedidos");
			
		} else {
			for(Biblioteca biblioteca : encontradas) {
				System.out.println("Este livro está disponivel na biblioteca "+biblioteca.getNome()+
								   " no endereco "+biblioteca.getEndereco());
			}
		}
	}
}
