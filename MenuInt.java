package classes.interacao;

import classes.Sistema;

public class MenuInt {

	public static void apresentarMenu() {
		System.out.println("Você é:");
		System.out.println("1) Usuario 2)Biblioteca");
		int opcao = Sistema.entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("1) Cadastrar usuario ou 2) Pedir livro");
			opcao = Sistema.entrada.nextInt(); // tratar caso de numero errado ou letra
			switch (opcao) {
			case 1:
				cadastrarUsuario();
			case 2:
				pedirLivro();
				break;
			}
		case 2:
			System.out.println("1) Cadastrar biblioteca ou 2) Avaliar entrega");
			opcao = Sistema.entrada.nextInt();
			switch (opcao) {
			case 1:
				cadastrarBiblioteca();
			case 2:
				avaliarEntrega();
			}

		}
	}
	
	public static void pedirLivro() {
		LivroInt.buscarLivro();
	}

	public static void cadastrarUsuario() {
	}

	public static void cadastrarBiblioteca() {
		BibliotecaInt.cadastrarBiblioteca();
	}

	public static void avaliarEntrega() {

	}
}
