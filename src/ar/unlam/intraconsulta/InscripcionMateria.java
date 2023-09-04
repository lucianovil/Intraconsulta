package ar.unlam.intraconsulta;

public class InscripcionMateria {

	private Alumno alumno;
	private Materia materia;
	private Nota nota;

	public InscripcionMateria(Alumno alumno, Materia materia) {
		this.alumno = alumno;
		this.materia = materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	public boolean tieneNota() {
		return nota != null;
	}
	
	public boolean isAprobada() {
		if (!tieneNota())
			return false;
		
		if (nota.getValor() < 4)
			return false;
		
		return true;
	}
	


	
	
}
