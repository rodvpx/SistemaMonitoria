package monitoria;

import java.util.ArrayList;

public abstract class Usuario {

	protected String nome;
	protected String email;
	protected String senha;
	protected String matricula;

	public Usuario(String matricula, String nome, String email, String senha) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	protected abstract boolean validar();

	public void cadastrarNovoUsuario(ArrayList<Usuario> usuarios) {
		if (!validar()) {
			System.out.println("Informações específicas inválidas.");
			return;
		}

		// Verifica se o e-mail já está sendo usado
		for (Usuario usuario : usuarios) {
			if (usuario.getEmail().equals(this.email) && usuario.getMatricula() == this.matricula) {
				System.out.println("Erro: Este e-mail já está cadastrado.");
				return;
			}
		}

		// Se todas as verificações passaram, adiciona o usuário à lista
		usuarios.add(this);
		System.out.println("Usuário cadastrado com sucesso.");
	}

	public boolean login(String email, String senha) {

		if (this.email.equals(email) && this.senha.equals(senha)) {
			System.out.println("Login realizado com sucesso.");
			return true;
		} else {
			System.out.println("Email ou senha incorretos. Tente novamente.");
			return false;
		}
	}

	abstract protected boolean cadastrarNovoUsuario();

	public String getNome() {
		return nome;
	}

	public static Usuario buscarPorEmail(ArrayList<Usuario> usuarios, String email) {
		for (Usuario usuario : usuarios) {
			if (usuario.getEmail().equals(email)) {
				return usuario;
			}
		}
		return null;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
