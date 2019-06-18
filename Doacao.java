package classes.modelo.atividades;

import java.util.ArrayList;

public class Doacao extends Atividade{
	private String titulo;
	
	public void doaLivro(ArrayList<String> catalogo, String titulo) {
		if(entregaLivro()) {
			catalogo.add(titulo);	
		}
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
