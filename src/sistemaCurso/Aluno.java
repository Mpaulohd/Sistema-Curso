package sistemaCurso;

public class Aluno {
	
	private long IdAluno;
	private String nomeAluno;
	private Curso nomeCurso;
	

	public Aluno() {
		
	}

	public Aluno(long idAluno, String nomeAluno, Curso nomeCurso) {
		super();
		IdAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.nomeCurso = nomeCurso;
	}

	public long getIdAluno() {
		return IdAluno;
	}

	public void setIdAluno(long idAluno) {
		IdAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Curso getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(Curso nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	
	
}


