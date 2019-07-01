package bookSmart;

public class Entrega extends Atividade {
	private Entregador entregador;
	private String livro;
	private String biblioteca;

	//essa classe me deixou com MUITA PREGUICA
	//pq na verdade esses atributos de cima nao deveriam ser strings
	//e sim classes. e na funcao gerarAtividade,
	//simplesmente puxar os strings dos nomes dos objetos e tals
	//e passar pra funcao que a gente deu Override
	//eu so to com preguica mesmo de fazer isso
	// o resto eu creio que va rodar, mas temos que testar.

	public Entrega(Entregador entregador, Livro livro, Biblioteca biblioteca) {
		this.entregador = entregador;
		this.livro = livro.getTitulo();
		this.biblioteca = biblioteca.getNome();
	}
	public String gerarAtividade(Entrega entrega) {
		return "Livro: "+ this.getLivro()+" entregue por: "+this.getEntregador().getNome()+" em Biblioteca: "+this.getBiblioteca();
	}
	
	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}

	public String getLivro() {
		return this.livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public String getBiblioteca() {
		return this.biblioteca;
	}

	public void setBiblioteca(String biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public void registrarAtividade(String atividade) {
		this.registroAtividade.add(atividade);
		
	}
	
}
