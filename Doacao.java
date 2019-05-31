package classes;

import java.util.ArrayList;

public class Doacao extends Atividade{
	private String titulo;
	
	public void doaLivro(ArrayList<String> catalogo, String titulo) {
		if(entregaLivro()) {
			catalogo.add(titulo);
			
		}
	}
	
}
