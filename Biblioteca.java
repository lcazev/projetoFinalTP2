package bookSmart;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca extends Usuario {
	static Scanner entrada = new Scanner (System.in);
	static ArrayList<Biblioteca> bibliotecasSistema = new ArrayList<Biblioteca>();
    private ArrayList<Livro> catalogo;
    private ArrayList<Pedido> livrosSolicitados;
    

    public Biblioteca(String nome, Endereco endereco, String email, String senha, ArrayList<Livro> catalogo) {
        super(nome, endereco, email, senha);
        this.setCatalogo(catalogo);
        @SuppressWarnings("unused")
        ArrayList<Pedido> livrosSolicitados = new ArrayList<Pedido>();
    }

    public void selecionarLivrosPedidos() {//eu tenho plena consciencia que essa funcao ta feia que doi
    	//se rodar a gente da um jeito de arrumar ela
    	int i=1;
       for(Pedido pedido : this.livrosSolicitados) {
    	   System.out.println(i+pedido.getLivroPedido().getTitulo());
    	   i++;
       }
       System.out.println("Digite o numero do livro que deseja selecionar: ");
       int numLivro = entrada.nextInt();
       this.livrosSolicitados.remove(this.livrosSolicitados.get(numLivro-1));
    }

    public ArrayList<Livro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Livro> catalogo) {
        this.catalogo = catalogo;
    }

    public void adicionarLivroCatalogo(Livro livro) {
    	this.catalogo.add(livro);
    }
    
}
