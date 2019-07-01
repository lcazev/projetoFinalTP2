package bookSmart;

import java.util.ArrayList;

public abstract class Pedido extends Atividade { 
	private Biblioteca bibOrigem;
	private Livro livroPedido;
	static ArrayList<Pedido> pedidos;

	public Pedido(Biblioteca bib, Livro livro) {
		this.setBibOrigem(bib);
		this.setLivroPedido(livro);
		pedidos.add(this); // o pedido vai para a fila no ato de sua criacao
		registrarAtividade(gerarPedido()); // o registro do pedido vai para o log de pedidos

	}

	public Biblioteca getBibOrigem() {
		return bibOrigem;
	}

	public void setBibOrigem(Biblioteca bibOrigem) {
		this.bibOrigem = bibOrigem;
	}

	public Livro getLivroPedido() {
		return livroPedido;
	}

	public void setLivroPedido(Livro livroPedido) {
		this.livroPedido = livroPedido;
	}

	public String gerarPedido() {
		return "Livro" + this.getLivroPedido().getTitulo() + " solicitado por " + this.getBibOrigem().getNome();
	}

	@Override
	public void registrarAtividade(String atividade) {
		registroAtividade.add(atividade);

	}
}
