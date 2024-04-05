package monitoria;

import java.util.ArrayList;

public class Aluno extends Usuario {

	private String matricula;
	private Monitoria monitoria;

	private ArrayList<Aluno> alunos = new ArrayList<>();

	public Aluno(String matricula, String nome, String email, String senha) {
		super(nome, email, senha);
		this.matricula = matricula;

	}

	@Override
	protected void cadastrarNovoUsuario() {

		try {
			Long.parseLong(this.matricula);
			if (this.matricula.length() == 10) {
				System.out.println("Você é um Aluno");
			} else {
				System.out.println("ERRO: A matrícula deve ter exatamente 10 dígitos.");
			}
		} catch (NumberFormatException e) {
			System.out.println("ERRO: Por favor, digite somente números na MATRÍCULA.");
		}

		for (Aluno email : alunos) {
			if (email.equals(this.email)) {
				System.out.println("ERRO: Este email/usuario já existe.");
				break;
			}
		}

		Aluno novoAluno = new Aluno(nome, email, senha, matricula);

		alunos.add(novoAluno);

	}

	public void realizarLoginParaTodosAluno(String email, String senha) {
		for (Aluno aluno : alunos) {
			aluno.login(email, senha);
		}
	}

	public void visualizarMonitorias(ArrayList<Monitoria> monitoria) {

	}

	public void inscreverMonitoria(Monitoria monitoria) {

	}

	public void solicitarMonitoria(Monitoria disciplina) {

	}

	public void candidatarMonitor(Monitoria disciplina) {

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Monitoria getMonitoria() {
		return monitoria;
	}

	public void setMonitoria(Monitoria monitoria) {
		this.monitoria = monitoria;
	}
}
