package bookSmart;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String email;
	protected Endereco endereco;
	private String senha;
	protected boolean ehEntregador = false;
	static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public Usuario(String nome, Endereco endereco, String email, String senha) {
		if (emailValido(email)) {
			this.setNome(nome);
			this.setEndereco(endereco);
			this.setEmail(email);
			this.setSenha(senha);
			usuarios.add(this);
		} else {
			System.out.println("Email invalido.");
		}

	}

	public void apagarUsuario() {
		usuarios.remove(this);
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
		return this.endereco.getEndCompleto();// para passar o endereco ao
												// entregador
	}

	public Bairro getBairro() {
		return this.endereco.getBairro();// para compararmos os bairros
	}

	public boolean ehEntregador() {
		return this.ehEntregador;
	}

	public boolean emailValido(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

	public boolean login(String email, String senha) {
		for (Usuario user : usuarios) {
			if (user.getEmail().equals(email) && user.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
}
