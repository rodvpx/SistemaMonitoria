package monitoria;

import java.util.ArrayList;

public class Monitor extends Aluno {
	
	public Monitor(String nome, String email, String senha) {
		super(nome, email, senha);
		
	}

	private ArrayList<String> disciplina;
	private Horario horario;
	private Local local;
	
	public void definirHorario(Aluno disciplina, Horario horario, Local local) {
		
	}
	
	public void consultarHorarios (ArrayList<Horario> horario) {
		
	}

	public ArrayList<String> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<String> disciplina) {
		this.disciplina = disciplina;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	

}
