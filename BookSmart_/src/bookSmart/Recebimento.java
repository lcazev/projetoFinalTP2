package bookSmart;

public class Recebimento extends Atividade{

	public void confirmarRecebimento(Pedido pedido, Entregador entregador) {
		entregador.entregasPendentes.remove(pedido);
		pedido.getBibOrigem().adicionarLivroCatalogo(pedido.getLivroPedido());
		registrarAtividade("Livro: "+pedido.getLivroPedido().getTitulo()+" entregue em "+
		pedido.getBibOrigem().getNome()+" por entregador(a) "+entregador.getNome());
	}
	


	@Override
	public void registrarAtividade(String atividade) {
		Atividade.registroAtividade.add(atividade);
		
	}
}

