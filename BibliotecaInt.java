package classes.interacao;

import java.util.ArrayList;

import classes.Sistema;
import classes.modelo.Biblioteca;
import classes.modelo.Endereco;

/**
 * Classe responsável por toda a interação com o usuário relacionada a biblioteca, como:
 * cadastramento, busca de bibliotecas, remoção etc.
 */
public class BibliotecaInt {

	public static void cadastrarBiblioteca() {
		System.out.println("Digite o nome da biblioteca:");
		Sistema.entrada.nextLine();
		String nome = Sistema.entrada.nextLine();
		System.out.println("Digite a rua da biblioteca:");
		String rua = Sistema.entrada.nextLine();
		System.out.println("Digite o numero:");
		int numero = Sistema.entrada.nextInt();
		System.out.println("Digite o complemento:");
		Sistema.entrada.nextLine();
		String complemento = Sistema.entrada.nextLine();
		System.out.println("Digite o bairro:");
		String bairro = Sistema.entrada.nextLine();
		System.out.println("Digite a cidade:");
		String cidade = Sistema.entrada.nextLine();
		System.out.println("Digite o email da biblioteca:");
		String email = Sistema.entrada.nextLine();
		ArrayList<String> catalogo = new ArrayList<String>();

		Endereco end = new Endereco(rua, numero, complemento, bairro, cidade);
		System.out.println("Adicione os titulos ao catalogo. Para parar, digite 0: ");
		while (true) {
			System.out.println("Adicione titulo:");
			String titulo = Sistema.entrada.nextLine();
			if (titulo.equals("0")) {
				break;
			} else {
				catalogo.add(titulo);
			}
		}
		
		Sistema.bibliotecas.adicionarBiblioteca(new Biblioteca(nome, end, email, catalogo));
		
		MenuInt.apresentarMenu();
	}
}
