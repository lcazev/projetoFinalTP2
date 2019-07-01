package bookSmart;

import java.util.ArrayList;

public abstract class Atividade {
	protected static ArrayList<String> registroAtividade = new ArrayList<String>();
	
	 public abstract void registrarAtividade(String atividade);
}
