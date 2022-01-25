package sistemaCurso;

public class Curso {

	private long IdCurso;
	private String nomeCurso;

	public Curso(){
		
	}

	public Curso(long idCurso, String nomeCurso) {
		super();
		IdCurso = idCurso;
		this.nomeCurso = nomeCurso;
	}

	public long getIdCurso() {
		return IdCurso;
	}

	public void setIdCurso(long idCurso) {
		IdCurso = idCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	
}

