package bookSmart;

import java.util.ArrayList;
import java.util.Scanner;

public class Entregador extends Usuario{

	static Scanner entrada = new Scanner(System.in);
	protected static ArrayList<Entregador> voluntariosEntrega=new ArrayList<Entregador>();
	//instanciar alguns voluntarios aqui.
	private Usuario entregador;
	protected ArrayList<Bairro> bairrosAtendidos = new ArrayList<>();
	protected ArrayList<Pedido> entregasPendentes= new ArrayList<>();

	public Entregador(String nome, Endereco endereco, String email, String senha){
		super(nome, endereco, email, senha);
		this.ehEntregador = true;
		ArrayList<Bairro> bairrosAtendidos = new ArrayList<Bairro>();
		ArrayList<Pedido> entregasPendentes = new ArrayList<Pedido>();
		escolherBairros();//abre a lista de bairros pro novo entregador escolher onde quer atuar
	}
	
	public Entregador(Usuario usuario){
		this(usuario.getNome(), usuario.endereco, usuario.getEmail(), usuario.getSenha());
	}
	
	public static ArrayList<Entregador> getVoluntariosEntrega() {
		return voluntariosEntrega;
	}


	public void escolherBairros() {
		exibirBairros();
		System.out.println("Digite os numeros dos bairros que deseja atender. Para parar, digite -1");
		ArrayList<Integer> bairrosAtend = new ArrayList<Integer>();
		int num = 0;
		do {
			num = entrada.nextInt();
			if (num > 0) {
				bairrosAtend.add(num);
			}
		} while (num > 0);
		//essa funcao retorna uma lista com os indices escolhidos
		adicionarBairrosLista(bairrosAtend);
		//aqui temos que inserir a funcao pra retornar ao inicio do ambiente de entregador.
		//talvez seja melhor trazer os ambientes para as classes, mas nao sei se e possivel.
	}

	public void adicionarBairrosLista(ArrayList<Integer> lista) {
		//essa funcao pega a lista com os indices gerada acima
		//e adiciona na lista de bairros do entregador que escolheu
		//eu nao sei se ta rodando direito essa parte, temos que analisar
		for (int indice : lista) {
			for (Bairro bairro : Bairro.values()) {
				if (indice == bairro.getNumBairro()) {
					this.bairrosAtendidos.add(bairro);
				}
			}
		}
		voluntariosEntrega.add(this);
	}

	public void exibirBairros() {
		// mostra o enum com os bairros disponiveis
		System.out.println("Abaixo estão os bairros disponíveis.");
		System.out.println("Selecione os que desejar atender.");
		for (@SuppressWarnings("unused")
		Bairro nome : Bairro.values()) {
			System.out.println(nome.getBairro() + " " + nome.getBairro());
		}
	}
	
	public void exibirEntregasPendentes() {
		//eu acho que inutilizei essa funcao já mostrando a lista de entregas
		//pendentes no ambiente do entregador
		//mas como nao sei se essa e a saida mais legal, vou deixar ela aqui
		//pro caso de movermos os ambientes para dentro das classes. 
	}
}
