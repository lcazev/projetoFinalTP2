package classes;
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

	public Entrega() {
		for (Entregador entregador : Entregador.voluntariosEntrega) {
			for (Bairro bairro : entregador.bairrosAtendidos) {
				for (Pedido pedido : Pedido.pedidos) {
					if (bairro.equals(pedido.getBibOrigem().getBairro())) {
						entregador.entregasPendentes.add(pedido);
						this.setEntregador(entregador);
						this.setLivro(pedido.getLivroPedido().getTitulo());
						this.setBiblioteca(pedido.getBibOrigem().getNome());
						gerarAtividade(this);
						
					}
				}
			}
		}
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
		// TODO Auto-generated method stub
		
	}

}
