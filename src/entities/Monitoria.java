package entities;

import java.util.Date;
import java.util.List;

public class Monitoria {
	
	private Date horarioEntrada;
	
	private Date horarioSaida;
	
	private Monitor monitor;
	
	private List<Aluno> participantes;

	public Date getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(Date horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public Date getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(Date horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public List<Aluno> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Aluno> participantes) {
		this.participantes = participantes;
	}
	
	
}
