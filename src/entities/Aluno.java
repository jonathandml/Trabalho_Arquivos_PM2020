package entities;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
	private String nome;
	
	private String curso;
	
	private String turno;
	
	private Map<Integer,Integer> notas;
	
	
	public Aluno(String nome, String curso, String turno) {
		this.nome = nome;
		this.curso = curso;
		this.turno = turno;
		notas =  new HashMap<Integer, Integer>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void addNota(int disciplinaId,int nota) {
		notas.put(disciplinaId, nota);
	}
	
	
}
