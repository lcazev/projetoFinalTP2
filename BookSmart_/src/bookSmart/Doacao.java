package bookSmart;

import java.util.ArrayList;

public class Doacao extends Atividade {
	public static ArrayList<Doacao> doacoes = new ArrayList<>();
	private Livro livroDoado;
	private Usuario doador;


	public Doacao(Usuario usuario, Livro livro) {
		this.setLivroDoado(livro);
		this.setDoador(usuario);
		doacoes.add(this); //adiciona esta doacao a lista geral de doacoes
		registrarAtividade(gerarDoacao());//adiciona esta doacao a lista geral de atividades
	}
	
	@Override
	public String toString() {
		
		return "Doacao: "+this.getLivro().getTitulo()+" do usuario: " + this.getDoador().getNome()+" no bairro: "+ this.getBairroDoacao();
	}

	public Usuario getDoador() {
		return doador;
	}

	public void setDoador(Usuario doador) {
		this.doador = doador;
	}

	public Livro getLivro() {
		return livroDoado;
	}

	public void setLivroDoado(Livro livro) {
		this.livroDoado = livro;
	}

	public Bairro getBairroDoacao() {
		return this.getDoador().getBairro();
	}

	public String gerarDoacao() {
		return "Doacao de livro" + this.getLivro() + " pelo usuario " + this.getDoador();
	}

	@Override
	public void registrarAtividade(String atividade) {
		Atividade.registroAtividade.add(atividade);

	}
}
