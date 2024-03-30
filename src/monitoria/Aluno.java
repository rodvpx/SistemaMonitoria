package monitoria;

import java.util.ArrayList;

public class Aluno extends Usuario {
	
	public Aluno(String nome, String email, String senha) {
		super(nome, email, senha);
	}

	private String matricula;
	private Monitoria monitoria;
	
	public void visualizarMonitorias (ArrayList<Monitoria> monitoria) {
		
	}
	
	public void inscreverMonitoria (Monitoria monitoria) {
		
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
