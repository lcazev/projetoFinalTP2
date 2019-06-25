package bookSmart;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private Endereco endereco;
    private String senha;
    static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public Usuario(String nome, Endereco endereco, String email, String senha) {
        if(emailValido(email)){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.setSenha(senha);
        usuarios.add(this);
        } else {
            System.out.println("Email invalido.");
        }

    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (emailValido(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Endereco de email invalido!");
            // na interface, fazer com que o cÃ³digo rode novamente pra pessoa
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
    
 

    public boolean login(String email, String senha){
        for(Usuario user:usuarios){
            if(user.getEmail().equals(email)&&user.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
}
