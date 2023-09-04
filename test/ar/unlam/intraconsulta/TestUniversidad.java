package ar.unlam.intraconsulta;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestUniversidad {

	@Test
	public void queSePuedaRegistrarUnAlumnoAUnaUniversidad() {
		String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "Marta";
    	String apellido = "perez";
    	Integer dni= 44555; 
    	Alumno alumno = new Alumno (dni,apellido, nombre);
		Boolean registroExitoso = unlam.registrar(alumno);
    	assertTrue(registroExitoso);
    	
    	
	}
	
	
	@Test
	public void queNoSePuedaRegistrarUnAlumnoCuandoElAlumnoYaEsteRegistradoAUnaUniversidad() {
		String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "Marta";
    	String apellido = "perez";
    	Integer dni= 44555; 
    	Alumno alumno = new Alumno (dni,apellido, nombre);
    	Alumno alumno2 = new Alumno (dni,"jose", "Lopez");
    	unlam.registrar(alumno);
		Boolean registroExitoso = unlam.registrar(alumno2);
    	assertFalse(registroExitoso);
    	
    	
	}
	
	@Test
	public void queSePuedaRegistrarUnaMateriaAUnaUniversidad() {
		String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "PB2 ";
        Integer codigo = 1;
        Materia pb2 = new Materia (codigo,nombre);
        assertTrue (unlam.registraMateria(pb2));
    	       
	}
	
	
	
	@Test
	public void queSePuedaInscribirUnAlumnoenMateria() {
		String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "PB2 ";
        Integer codigo = 1;
        Materia pb2 = new Materia (codigo,nombre);
        unlam.registraMateria(pb2);
     	nombre = "Marta";
    	String apellido = "perez";
    	Integer dni= 44555; 
        Alumno alumno = new Alumno (dni,apellido, nombre);
    	unlam.registrar(alumno);
    	assertTrue (unlam.inscribirAlumnoAUnaMateria(dni,codigo)) ;
    	       
	}
	
	@Test
	public void queSePuedaAsociarUnaMateriaCorrelativaAOtraMateria() {
		String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	
    	nombre = "PB1";
        Integer codigo = 1;
        Materia pb1 = new Materia (codigo, nombre);
        
        unlam.registraMateria(pb1);
        
        nombre = "PB2";
        codigo = 2;
        ArrayList<Materia> correlativas = new ArrayList<>();
        correlativas.add(pb1);
        Materia pb2 = new Materia (codigo, nombre);
        
        pb2.agregarCorrelativa(pb1);
        unlam.registraMateria(pb2);
        
        ArrayList<Materia> correlativas2 = pb2.getCorrelativas();
        
        assertTrue(correlativas2.contains(pb1));
	}
	
	@Test
	public void queNoSePuedaAsociarUnaMateriaCorrelativaAOtraMateriaPorqueYaExiste() {
		String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	
    	nombre = "PB1";
        Integer codigo = 1;
        Materia pb1 = new Materia (codigo, nombre);
        
        unlam.registraMateria(pb1);
        
        nombre = "PB2";
        codigo = 2;
        ArrayList<Materia> correlativas = new ArrayList<>();
        correlativas.add(pb1);
        Materia pb2 = new Materia (codigo, nombre);
        
        pb2.agregarCorrelativa(pb1);
        assertFalse(pb2.agregarCorrelativa(pb1));
        
	}
	
	public void queSePuedaCalificar() {
		
		String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	
    	nombre = "PB1";
        Integer codigo = 1;
        Materia pb1 = new Materia (codigo, nombre);
        
        unlam.registraMateria(pb1);
        
     	nombre = "Marta";
    	String apellido = "perez";
    	Integer dni= 44555; 
        Alumno alumno = new Alumno (dni,apellido, nombre);
    	unlam.registrar(alumno);
    	unlam.inscribirAlumnoAUnaMateria(dni,codigo);
    	
    	Nota nota = new Nota(9);
    	unlam.calificar(dni, codigo, nota);
    	
		Nota nota2 = unlam.getNota(dni, codigo);
		assertEquals(nota, nota2);
	}
	
	@Test
	public void queSePuedaSaberSiUnAlumnoAproboUnaDeterminadaMateria() {

    	
        
        
		
	}
	
	
	@Test
	public void queSeNoPuedaInscribirAUnAlumnoSiAdeudaLaCorrelativa() {
		
	}
	
	
	@Test
	public void queSePuedaInscribirAUnAlumnoALaCorrelativa() {
		
	}
	
	
	
	
	
	
	
	
	

	

}
