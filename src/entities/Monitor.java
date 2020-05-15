package entities;

import java.util.Date;

public class Monitor{
	private int DiscliplinaId;
	
	private Date horarioEntrada;
	
	private Date horarioSaida;
	
	private Aluno responsavel;
	
	public Monitor() {
	}

	public Monitor(int discliplinaId, Date horarioEntrada, Date horarioSaida) {
		DiscliplinaId = discliplinaId;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}

	public int getDiscliplinaId() {
		return DiscliplinaId;
	}

	public void setDiscliplinaId(int discliplinaId) {
		DiscliplinaId = discliplinaId;
	}

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

	public Aluno getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Aluno responsavel) {
		this.responsavel = responsavel;
	}
	
	
	
	
	
}
