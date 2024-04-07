package monitoria;

import java.util.ArrayList;

public class Aluno extends Usuario {

	public Aluno(String matricula, String nome, String email, String senha) {
		super(matricula, nome, email, senha);
		//TODO Auto-generated constructor stub
	}

	private Monitoria monitoria;


	@Override
	protected boolean validar(){
		return this.matricula != null && this.matricula.length() == 10;
	}

	@Override
	protected boolean cadastrarNovoUsuario() {
		return true;
	}

	/*@Override
	public static boolean cadastrarNovoUsuario(ArrayList<Aluno> alunos, String matricula, String nome, String email, String senha) {
			try {
				// Verifica se a matrícula é um número longo
				Long.parseLong(matricula);
	
				// Verifica se a matrícula tem 10 dígitos
				if (matricula.length() != 10) {
					System.out.println("ERRO: Matrícula deve ter 10 números.");
					return false;
				}
	
				// Verifica se já existe aluno com o mesmo email ou matrícula
				for (Aluno aluno : alunos) {
					if (aluno.getMatricula().equals(matricula) || aluno.getEmail().equals(email)) {
						System.out.println("Não foi possível criar cadastro de Aluno.");
						System.out.println("Email e/ou matrícula já existentes.");
						return false;
					}
				}
	
				// Se passou pelas verificações, adiciona o novo aluno
				Aluno novoAluno = new Aluno(matricula, nome, email, senha);
				alunos.add(novoAluno);
				return true;
			} catch (NumberFormatException e) {
				System.out.println("ERRO: Matrícula deve ser numérica.");
				return false;
			}
		}*/

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
