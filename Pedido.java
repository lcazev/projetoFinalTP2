package bookSmart;

import java.util.ArrayList;

public abstract class Pedido extends Atividade { 
 private Biblioteca bibOrigem;
 private Livro livroPedido; 
static ArrayList<Pedido> pedidos;
	
	public Pedido(Biblioteca bib, Livro livro) {
	    this.setBibOrigem(bib);
	    this.setLivroPedido(livro);
	    pedidos.add(this);
	
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
    
	
	
	
}
