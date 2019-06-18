package classes;

import java.util.ArrayList;

public class Entrega {

	private ArrayList<Usuario> voluntariosEntrega;
	private Usuario entregador;

	public Usuario setEntregador(Biblioteca biblioteca) {
		for (int i = 0; i < voluntariosEntrega.size(); i++) {
			if (voluntariosEntrega.get(i).getEndereco().equals(biblioteca.getEndereco())) {
				return voluntariosEntrega.get(i);
			}
		}
		return null;
	}

	public void realizarEntrega(Livro livro, Biblioteca biblioteca, Endereco endereco) {
		// enviar mensagem ao entregador definido em setEntregador
		// para que busque o livro no endereço mostrado
		// e leve-o na biblioteca mostrada
	}
}
