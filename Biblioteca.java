import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca extends Usuario {
	static Scanner entrada = new Scanner (System.in);
	static ArrayList<Biblioteca> bibliotecasSistema = new ArrayList<Biblioteca>();
    private ArrayList<String> livrosRecebidos;
    private ArrayList<Livro> catalogo;
    

    public Biblioteca(String nome, Endereco endereco, String email, ArrayList<Livro> catalogo) {
        super(nome, endereco, email);
        //ArrayList<String> catalogo = new ArrayList<String>();
        this.setCatalogo(catalogo);
        @SuppressWarnings("unused")
        ArrayList<String> livrosRecebidos;
    }

    public ArrayList<String> getLivrosRecebidos() {
        return livrosRecebidos;
    }

    public ArrayList<Livro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Livro> catalogo) {
        this.catalogo = catalogo;
    }
    public void cadastrarBiblioteca(Biblioteca biblioteca) {
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
    	bibliotecasSistema.add(biblioteca);
    }
    
    public static void obterLivroPorTitulo(String livro) {
		for (int i = 0; i < bibliotecasSistema.size(); i++) {
			if (bibliotecasSistema.get(i).getCatalogo().contains(livro)) {
				System.out.println("Este livro está disponivel na biblioteca "+bibliotecasSistema.get(i).getNome());
			} else {
				System.out.println("Livro nao encontrado. Redirecionando para pedidos"); 
				
			}
		}
    }
}
