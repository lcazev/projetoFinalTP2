package classes;

import java.util.ArrayList;

public abstract class Atividade {
	public static ArrayList<String> registroAtividade = new ArrayList<String>();
	
	 public abstract void registrarAtividade(String atividade);
}
