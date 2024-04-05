package monitoria;

public abstract class Usuario {

	protected String nome;
	protected String email;
	protected String senha;

	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public boolean login(String email, String senha) {

		if ((email == null || email.isEmpty()) && (senha == null || senha.isEmpty())) {
			System.out.println("ERRO: Login não pode ser vazio.");
			return false;
		}

		if (email.equals(this.email) && senha.equals(this.senha)) {
			System.out.println("Login feito com sucesso");
			return true;

		} else {
			System.out.println("ERRO: Login inválido, senha ou email incorretos.");
			return false;
		}
	}

	abstract protected void cadastrarNovoUsuario();

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
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
