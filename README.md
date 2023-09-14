# Intraconsulta
Se desea desarrollar un sistema de gestión de notas de los alumnos basados en las siguientes características
La universidad deberá: Registrar :
Materia id Nombre 
Alumnos Id, nombre , Apellido , Fecha Nacimiento, fechaIngreso

CicloLectivo . Id,  fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo, fechaInicioInscripcion, fechaFinalizacionInscripcion
Comisión id , Materia, y cicloLectivo, Turno
Aula id, Cantidad De Alumnos

Restricciones 
No se puede asignar 2 materias con mismo Id
No se puede asignar 2 alumnos con mismo DNI
No se puede asignar 2 ciclos Lectivo con mismo Id 
No se Pueden generar 2 Comisiones para la misma materia, el mismo cicloLectivo y el mismo turno

Se deberán generar las siguientes Funcionalidades
AgregarMaterias  
AgregarAlumnos
CrearCicloLectivo
CrearCurso
crearDocentes
AsiganarMateriaCorrelativa (código Materia,  código DeMateria Correlativa)
//Se debe validar que ambos códigos existan en una materia
 EliminarCorrelativa(codigoMateria, CodigoCorrelativaAELiminar)
//Se debe validar que ambos códigos existan en una materia
InscribirAlumnoACurso (dni, CodigoCurso)
// Verificar que el alumno y el curso este dado de alta
//No se puede inscribir Alumnos si este no tiene al menos cursada todas las correlativas (Todas las correlativas Con nota >=4
//La inscripción no se puede realizar si esta fuera de fecha Inscripción
//No se puede inscribir el alumno si excede la cantidad de alumnos permitos en el aula

// No se puede inscribir el Alumno si ya está inscripto a otro curso para el mismo día y Turno

AsignarProfesoresALCurso(idCurso, dniDocente)
// verificar que exista el curso y el docente
//Cada 20 alumnos se debe agregar un docente ejemplo de 1 a 20 alumnos solo se puede asignar un docente, de 21 a 40 2 docentes

registrarNota (id_curso, id_alumno, Nota)
// La nota debe estar entre 1 y 10
// No se puede asignar Una nota Mayor o igual a 7 si no están todas las correlativas aprobadas (Mayor o igual a 7)
//Las notas pueden ser de tipo 1erParc, 2doParc, Rec1Parcial, Rec2Parcial
//se pueden asignar hasta 3 tipos de notas  pero no se pueden cargar 2 notas del mismo tipo, 
 //ejemplo Valido nota de 1erParc, 2doParc, Rec1Parcial, o 2doParc, Rec1Parcial, Rec2Parcial

obtenerListadoMateriasAprobadasParaUnAlumno(idAlumno)
Ejemplo
Dni nombre apellido nombreMateria Nota descripción cicloLectivo
222  Juan   Perez         PB2                      7          20232C
222  Juan   Perez         PB1                      7          20231C


obtenerMateriasQueFaltanCursarParaUnAlumno(idAlumno)
Taller Web1
Taller Web2


ObtenerReporteDeNotasDeAumnosDeCurso(idCurso)
Curso  nombreMateria Dni nombre apellido Nota  
 1         PB2			222  Juan   Perez         PB2                      7        
 1         PB2			444  Lucia  Garcia         PB2                      7        
