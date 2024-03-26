package monitoria;

public class Supervisor extends Usuario {
	
	private String departamento;
	Monitor monitor;
	Monitor disciplina;
	
	public boolean aceitarMonitor (Monitor monitor) {
		return true;
		
	}
	
	public void excluirMonitor (Monitor monitor) {
		
	}
	
	public void adicionarDisciplina (Monitor disciplina) {
		
	}
	
	public void excluirDisciplina (Monitor disciplina) {
		
	}
	
	public void designarMonitor (Monitor monitor, Monitor disciplina) {
		
	}
	
	public void ajustarHorarioMonitoria (Monitoria monitoria, Monitoria horario, Monitoria local) {
		
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Monitor getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Monitor disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
