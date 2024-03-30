package monitoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {

	protected String nome;
	protected String email;
	protected String senha;

	private static List<Usuario> usuariosCadastrados = new ArrayList<>();

	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public static Usuario cadastrarNovoUsuario() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Senha: ");
		String senha = scanner.nextLine();

		Usuario novoUsuario = new Usuario(nome, email, senha);
		usuariosCadastrados.add(novoUsuario); // Adiciona o novo usuário à lista

		scanner.close();

		return novoUsuario;
	}

	public boolean login(String email, String senha) {

		if (email == null || senha == null || (email.equals("") || senha.equals(""))) {
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

	public static boolean fazerLogin() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Senha: ");
		String senha = scanner.nextLine();

		scanner.close();

		Usuario usuario = buscarUsuarioPorEmail(email);

		if (usuario != null) {
			return usuario.login(email, senha);
		} else {
			System.out.println("ERRO: Usuário não encontrado.");
			return false;
		}
	}

	private static Usuario buscarUsuarioPorEmail(String email) {
		for (Usuario usuario : usuariosCadastrados) {
			if (usuario.email.equals(email)) {
				return usuario;
			}
		}
		return null; // Usuário não encontrado
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
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
