package classes.modelo.atividades;

import java.util.ArrayList;

public class Pedido extends Atividade { 
   // Pedido precisa herdar tamb�m Usu�rio? 
   //Pedido deve ter os dados de quem o fez.
	
	ArrayList<String> pedidos;
	
	public Pedido() {
		// os dados do usu�rio precisam ser passados ao fazer um pedido?
		// o que efetivamente precisa ser informado ao se fazer um pedido?
	}
	
	public void pedeLivro(String titulo) {
		this.pedidos.add(titulo);
	}

	@Override
	public boolean buscaLivro() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doaLivro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean entregaLivro() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pedeLivro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recebeLivro() {
		// TODO Auto-generated method stub
		
	}
}
