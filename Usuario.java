package classes;

public class Usuario {
    private String nome;
    private String email;
    private Endereco endereco;

    public Usuario(String nome, Endereco endereco, String email) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setEmail(email);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (emailValido(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Endereço de email inválido!");
            // na interface, fazer com que o código rode novamente pra pessoa
            // inserir outro email.
        }
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return this.endereco.getEndCompleto();
    }

    

    public boolean emailValido(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

}
