package bookSmart;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	static Scanner entrada = new Scanner(System.in);

	// Scanner usuarios = new Scanner("catalogoUsuarios.txt");

	/*
	 * while(usuarios.hasnext()) { Usuario.setNome(usuarios.next());
	 * Usuario.setEmail(usuarios.next());
	 * Usuario.setEndereco(usuarios.next());
	 * Usuario.setSenha(usuarios.next()); // Usuario.usuarios.add(); fiquei
	 * na dúvida aqui se tem que adicionar // à lista ou se isso já monta a
	 * lista
	 * 
	 * // Fiquei com dúvida também no
	 * Usuario.setEndereco(usuarios.next()), // porque endereço se desdobra
	 * em vários campos // e no arquivo tá um embaixo do outro // logradouro
	 * // numero // etc }
	 */

	private ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();// arquivo
																			// com
																			// todas
																			// as
																			// bibs

	public static void menu() {
		System.out.println("Bem vindo ao BookSmart! Selecione uma opcao:");
		System.out.println("1) Cadastrar usuario");
		System.out.println("2) Cadastrar biblioteca");
		System.out.println("3) Entrar como usuario");// acho que aqui direciona
														// pro ambiente de user
														// comum, temos que
														// diferenciar do
														// entregador
		int opcaoMenu = entrada.nextInt();
		switch (opcaoMenu) {
		case 1:
			cadastrarUsuario();
		case 2:
			cadastrarUsuario();
		case 3:
			entrar();
		}
	}

	public static void cadastrarUsuario() {
		System.out.println("Digite o nome: ");
		String nome = entrada.next();
		System.out.println("Digite seu endereco:");
		System.out.println("Logadouro: ");
		String logadouro = entrada.next();
		entrada.next();
		System.out.println("Numero: ");
		int numero = entrada.nextInt();
		System.out.println("Complemento: ");
		String complemento = entrada.next();
		entrada.next();
		System.out.println("Bairro: ");
		String bairro = entrada.next();
		System.out.println("Cidade:");
		String cidade = entrada.next();
		System.out.println("Email");
		String email = entrada.next();
		System.out.println("Escolha uma senha");
		String senha = entrada.next();
		System.out.println("1) CADASTRAR COMO USUARIO, 2) CADASTRAR COMO BIBLIOTECA ");
		int cadastroOpcao = entrada.nextInt();
		switch (cadastroOpcao) {
		case 1:
			Usuario.usuarios
					.add(new Usuario(nome, new Endereco(logadouro, numero, complemento, Bairro.URCA, cidade), email, senha));
			//TODO MUDAR OS BAIRROS PRA APRESENTAR O ENUM!!!!!!!!!!!!!!!!!!!!!!!
			System.out.println(" Usuario cadastrado com sucesso! Fazer login: ");
			entrar();
		case 2:
			ArrayList<Livro> cadastroCatalogo = new ArrayList<Livro>();
			System.out.println("Adicione os titulos ao seu catalogo. Para parar, digite 0: ");
			while (true) {
				System.out.println("Adicione titulo:");
				String titulo = entrada.next();
				System.out.println("Adicione autor:");
				String autor = entrada.next();
				if (titulo.equals("0")) {
					break;
				} else {
					cadastroCatalogo.add(new Livro(titulo, autor));
				}
			}
			Biblioteca.bibliotecasSistema.add(new Biblioteca(nome,
					new Endereco(logadouro, numero, complemento,Bairro.URCA, cidade), email, senha, cadastroCatalogo));
			//TODO MUDAR OS BAIRROS PRA APRESENTAR O ENUM!!!!!!!!!!!!!!!!!!!!!!!
		}

	}

	public static void entrar() {
		System.out.println("Digite seu email:");
		String email = entrada.next();
		System.out.println("Digite sua senha:");
		String senha = entrada.next();
		for (Usuario user : Usuario.usuarios) {
			if (!user.ehEntregador && user.getEmail().equals(email) && user.getSenha().equals(senha)) {
				ambienteUser(user);
			}
		}

		for (Entregador entregador : Entregador.voluntariosEntrega) {
			if (entregador.getEmail().equals(email) && entregador.getSenha().equals(senha)) {
				ambienteUser(entregador);
			}
		}
		for (Biblioteca biblioteca : Biblioteca.bibliotecasSistema) {
			if (biblioteca.getEmail().equals(email) && biblioteca.getSenha().equals(senha)) {
				ambienteUser(biblioteca);
			}
		}

	}

	public static void criarDoacao(Usuario usuario) {
		System.out.println("Digite o titulo do livro: ");
		String tituloLivro = entrada.next();
		System.out.println("Digite o autor do livro: ");
		String autorLivro = entrada.next();
		new Doacao(usuario, new Livro(tituloLivro, autorLivro));
		System.out.println("Obrigado");
	}

	public static void ambienteUser(Usuario usuario) {

		System.out.println("Ola! O que deseja fazer?");
		System.out.println("1) Doar livro");
		System.out.println("2) Tornar-se um entregador");
		System.out.println("3) Sair");//OLHA ISSO!!!! TODO
		int opcaoComum = entrada.nextInt();
		switch (opcaoComum) {
		case 1:
			criarDoacao(usuario);
			break;
		case 2:
			new Entregador(usuario);
			usuario.apagarUsuario();

			System.out.println("Obrigado por se voluntariar!");
			break;
		}

	}

	public static void ambienteUser(Entregador entregador) {
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

	public static void ambienteUser(Biblioteca biblioteca) {
		System.out.println("Ola! O que deseja fazer?");
		System.out.println("1) Pedir livro");
		System.out.println("2) Confirmar o recebimento de um livro");
		int opcaoBiblioteca = entrada.nextInt();
		switch (opcaoBiblioteca) {
		case 1:
			System.out.println("Digite o titulo do livro: ");
			String titulo = entrada.next();
			System.out.println("Digite o autor do livro: ");
			String autor = entrada.next();
			// new Pedido(biblioteca, new Livro(titulo, autor));
		case 2:
			biblioteca.selecionarLivrosPedidos();
			System.out.println("Livro recebido com sucesso!");
		}
	}
	
	public void imprimeDoacoesElegiveis(Entregador entregador){
		for(int i = 0; i<Doacao.doacoes.size(); i++){
			if(entregador.bairrosAtendidos.contains(Doacao.doacoes.get(i).getBairroDoacao())){
				System.out.println(i+1 + ": "+ Doacao.doacoes.get(i));
			}
		}
	}

	public static void main(String[] args) {
		Entregador e = new Entregador("Laryssa Azevedo", new Endereco("Rua General Roca", 350, "apto 301", Bairro.TIJUCA, "Rio de Janeiro"),
				"laryssa.azevedo@uniriotec.br", "123456");
		//e.bairrosAtendidos.add(Bairro.BANGU);
		//e.bairrosAtendidos.add(Bairro.GAVEA);
		new Usuario("Luiza Agostinho", new Endereco("Avenida Pasteur", 100, "apto 1010", Bairro.URCA, "Rio de Janeiro"),
				"luiza.agostinho@uniriotec.br", "123456");
		new Usuario("Maria Silva",
				new Endereco("Rua Marques de Sao Vicente", 925, "apto 904", Bairro.GAVEA, "Rio de Janeiro"),
				"maria.silva@uniriotec.br", "123456");
		new Usuario("Julio Sousa", new Endereco("Rua Quito", 10, "casa", Bairro.PENHA, "Rio de Janeiro"),
				"julio.sousa@uniriotec.br", "123456");
		menu();
	}

}
