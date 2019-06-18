package classes;

import java.util.ArrayList;

public class Doacao extends Atividade {
	public static ArrayList<Doacao> doacoes;
	private Livro livroDoado;
	private Usuario doador;

	public Doacao(Usuario usuario, Livro livro) {
		this.setLivroDoado(livro);
		ArrayList<Doacao> doacoes = new ArrayList<Doacao>();
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

	public void definirBiblioteca(Livro livro) {
		for (int i = 0; i < Pedido.pedidos.size(); i++) {
			for (int j = 0; j < Biblioteca.bibliotecasSistema.size(); j++) {
				if (!Biblioteca.bibliotecasSistema.get(j).getCatalogo().contains(livro)) {
					if (Pedido.pedidos.get(i).getAutorPedido().getEndereco()
							.equals(Biblioteca.bibliotecasSistema.get(j).getEndereco())) {
						doarLivro(livro, Biblioteca.bibliotecasSistema.get(j),
								Pedido.pedidos.get(i).getAutorPedido().getEndereco());
					}

				}

			}
		}

	}

	public void doarLivro(Livro livro, Biblioteca biblioteca, String endereco) {
		// relacionar este método com o método realizarEntrega

	}

	public void gerarDoacao() {
		doacoes.add(this);
		registrarAtividade("Doacao de livro" + this.getLivro() + " pelo usuario " + this.getDoador());
	}

	@Override
	public void registrarAtividade(String atividade) {
		Atividade.registroAtividade.add(atividade);

	}

}
