package classes;

public abstract class Atividade {
	private String nome;
	
	public abstract void doaLivro();
	public abstract boolean entregaLivro();
	public abstract void pedeLivro();
	public abstract void recebeLivro();
}
