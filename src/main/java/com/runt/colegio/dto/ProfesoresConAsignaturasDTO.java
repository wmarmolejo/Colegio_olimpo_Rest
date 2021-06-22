package com.runt.colegio.dto;

import java.util.List;

import com.runt.colegio.entity.Asignatura;
import com.runt.colegio.entity.Curso;
import com.runt.colegio.entity.Profesor;



public class ProfesoresConAsignaturasDTO {

	private Profesor profesor;

	private List<Asignatura> asignatura;
	
	private List<Curso> curso;
	

	public ProfesoresConAsignaturasDTO(Profesor profesor, List<Asignatura> asignatura, List<Curso> curso ) {
		super();
		this.profesor = profesor;
		this.asignatura = asignatura;
		this.curso = curso;
	}

	public ProfesoresConAsignaturasDTO() {
		super();
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public List<Asignatura> getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(List<Asignatura> asignatura) {
		this.asignatura = asignatura;
	}

	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

	
}
