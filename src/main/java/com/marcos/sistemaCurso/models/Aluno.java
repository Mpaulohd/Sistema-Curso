package com.marcos.sistemaCurso.models;

public class Aluno {
	
	private long id;
	private String nome;

	private Curso curso;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Aluno() {
		
	}

	public Aluno(long id, String nome, Curso curso) {
		super();
		this.id = id;
		this.nome = nome;
		this.curso = curso;
	}
	
	
	
}
