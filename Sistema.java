package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	public static Scanner entrada = new Scanner(System.in);
	public static Bibliotecas bibliotecas = new Bibliotecas();

	public static void main(String[] args) {
		MenuInt.apresentarMenu();
	}
}

	public static void pedirLivro() {
		System.out.println("Bem-vindo(a)! Digite o titulo do livro que deseja pedir:");
		entrada.nextLine();
		String titulo = entrada.nextLine();
		obterLivroPorTitulo(titulo);

	}

	public static void obterLivroPorTitulo(String livro) {
		for (int i = 0; i < bibliotecas.size(); i++) {
			if (bibliotecas.get(i).getCatalogo().contains(livro)) {
				System.out.println("Este livro está disponivel na biblioteca "+bibliotecas.get(i).getNome()+" no endereco "+
						bibliotecas.get(i).getEndereco());//add endereco
				//criar um metodo em endereco pra retornar uma string com o end completo
				//e adicionar ao endereco da biblioteca acima
			} else {
				System.out.println("Livro nao encontrado. Redirecionando para pedidos"); 
				
			}
		}
	}
	public static void cadastrarUsuario() {

	}

	public static void cadastrarBiblioteca() {
		System.out.println("Digite o nome da biblioteca:");
		entrada.nextLine();
		String nome = entrada.nextLine();
		System.out.println("Digite a rua da biblioteca:");
		String rua = entrada.nextLine();
		System.out.println("Digite o numero:");
		int numero = entrada.nextInt();
		System.out.println("Digite o complemento:");
		entrada.nextLine();
		String complemento = entrada.nextLine();
		System.out.println("Digite o bairro:");
		String bairro = entrada.nextLine();
		System.out.println("Digite a cidade:");
		String cidade = entrada.nextLine();
		System.out.println("Digite o email da biblioteca:");
		String email = entrada.nextLine();
		ArrayList<String> catalogo = new ArrayList<String>();

		Endereco end = new Endereco(rua, numero, complemento, bairro, cidade);
		System.out.println("Adicione os titulos ao catalogo. Para parar, digite 0: ");
		while (true) {
			System.out.println("Adicione titulo:");
			String titulo = entrada.nextLine();
			if (titulo.equals("0")) {
				break;
			} else {
				catalogo.add(titulo);
			}
		}
		bibliotecas.add(new Biblioteca(nome, end, email, catalogo));
		menu();
		
	}

	public static void avaliarEntrega() {

	}

	public static void menu() {
		System.out.println("Você é:");
		System.out.println("1) Usuario 2)Biblioteca");
		int opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("1) Cadastrar usuario ou 2) Pedir livro");
			opcao = entrada.nextInt(); // tratar caso de numero errado ou letra
			switch (opcao) {
			case 1:
				cadastrarUsuario();
			case 2:
				pedirLivro();
				break;
			}
		case 2:
			System.out.println("1) Cadastrar biblioteca ou 2) Avaliar entrega");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				cadastrarBiblioteca();
			case 2:
				avaliarEntrega();
			}
		
	}
	}
	// montando uma interface simples para testar o funcionamento
		
	public static void main(String[] args) {
		menu();

		}

	}
