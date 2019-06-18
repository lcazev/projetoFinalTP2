package classes.interacao;

import java.util.List;

import classes.Sistema;
import classes.modelo.Biblioteca;

public class LivroInt extends Atividade {
	
	public static void buscarLivro() {
		System.out.println("Bem-vindo(a)! Digite o titulo do livro que deseja pedir:");
		Sistema.entrada.nextLine();
		String titulo = Sistema.entrada.nextLine();
	}
}
