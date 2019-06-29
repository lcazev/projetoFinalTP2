package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	static Scanner entrada = new Scanner(System.in);

	static ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();// arquivo com todas as bibs

	public static void menu() {
		System.out.println("Bem vindo ao BookSmart! Selecione uma opcao:");
		System.out.println("1) Cadastrar usuario");
		System.out.println("2) Cadastrar biblioteca");
		System.out.println("3) Entrar como usuario");// acho que aqui direciona pro ambiente de user comum, temos que
														// diferenciar do entregador
		System.out.println("4) Entrar como biblioteca");
		int opcaoMenu = entrada.nextInt();
		switch (opcaoMenu) {
		case 1:
			cadastrarUsuario();
		case 2: // quero cadastrar como usuario e adicionar na lista de bibliotecas. dificuldade
				// fácil
		case 3: // quero criar um ambiente de biblioteca assim como tem o dos usuarios
		}
	}

	public static void cadastrarUsuario() {
		System.out.println("Digite o nome: ");
		String nome = entrada.nextLine();
		entrada.nextLine();
		System.out.println("Digite seu endereco:");
		System.out.println("Logadouro: ");
		String logadouro = entrada.nextLine();
		System.out.println("Numero: ");
		int numero = entrada.nextInt();
		System.out.println("Complemento: ");
		String complemento = entrada.nextLine();
		entrada.nextLine();
		System.out.println("Bairro: ");
		String bairro = entrada.nextLine();
		System.out.println("Cidade:");
		String cidade = entrada.nextLine();
		System.out.println("Email");
		String email = entrada.nextLine();
		System.out.println("Escolha uma senha");
		String senha = entrada.nextLine();

		Usuario.usuarios
				.add(new Usuario(nome, new Endereco(logadouro, numero, complemento, bairro, cidade), email, senha));
		System.out.println("Cadastrado com sucesso! Fazer login: ");
		entrar();
	}

	public static void entrar() {
		System.out.println("Digite seu email:");
		String email = entrada.nextLine();
		System.out.println("Digite sua senha");
		String senha = entrada.nextLine();
		for (Usuario user : Usuario.usuarios) {
			for (Entregador entregador : Entregador.voluntariosEntrega) {
				if (user.getEmail().equals(email) && user.getSenha().equals(senha)) {
						ambienteUser(user);
					} else if(entregador.getEmail().equals(email) && entregador.getSenha().equals(senha)) {
						ambienteUser(entregador);
				} else {
					System.out.println("Login ou senha invalidos! Tente novamente: ");
					entrar();
				}
			}
		}
	}

	public static void ambienteUser(Usuario usuario) {

		System.out.println("Ola! O que deseja fazer?");
		System.out.println("1) Doar livro");
		System.out.println("2) Tornar-se um entregador");
		int opcaoComum = entrada.nextInt();
		switch (opcaoComum) {
		case 1: //ainda nao implementei
		case 2:
			usuario.setEhEntregador(true);
			System.out.println("Obrigado por se voluntariar!");
		}

	}

	public void ambienteEntregador(Entregador entregador) {
		System.out.println("Ola! O que deseja fazer?");
		System.out.println("1) Doar livro");
		System.out.println("2) Realizar entrega");
		int opcaoEntregador = entrada.nextInt();
		switch (opcaoEntregador) {
		case 1:
		case 2:
			System.out.println("Aqui estao suas entregas pendentes:");
			System.out.println(entregador.entregasPendentes.toString());
		}
	}

	public static void main(String[] args) {
		menu();
	}

}
