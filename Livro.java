public class Livro {
    private String titulo;
    private String autor;

    public Livro(String autor, String titulo) {
        this.setAutor(autor);
        this.setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
