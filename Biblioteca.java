import java.util.ArrayList;

public class Biblioteca extends Usuario {
    private ArrayList<String> livrosRecebidos;
    private ArrayList<String> catalogo;

    public Biblioteca(String nome, Endereco endereco, String email, ArrayList<String> catalogo /*criar arq texto com catalogos*/) {
        super(nome, endereco, email);
        this.setCatalogo(catalogo);
        @SuppressWarnings("unused")
        ArrayList<String> livrosRecebidos;
    }

    public ArrayList<String> getLivrosRecebidos() {
        return livrosRecebidos;
    }

    public ArrayList<String> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<String> catalogo) {
        this.catalogo = catalogo;
    }

}
