package com.runt.colegio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@ApiModel("Entity Asignatura")
@Table(name = "asignatura")
public class Asignatura implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id 
    @Column(name = "id_asig")
    private Integer idAsig;

    @Column(name = "asig_nombre")
    private String asigNomber;

    @ApiModelProperty("Profesor de asignatura")
   	@JoinColumn(name = "Profesor_id_pro")
   	@ManyToOne(optional = true)
    private Profesor profesor;

    @ApiModelProperty("Curso de asignatura")
   	@JoinColumn(name = "Curso_id_cur")
   	@ManyToOne(optional = true)
    private Curso curso;

    @JsonIgnore
 	@ApiModelProperty("Asignatura de estudiante")
 	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy="asignatura")
   // @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "holidayDates")
 	private List<Asignatura_Estudiante> Asignatura_Estudiante = new ArrayList<>();
     

    public Integer getIdAsig() {
		return idAsig;
	}


	public void setIdAsig(Integer idAsig) {
		this.idAsig = idAsig;
	}


	public String getAsigNomber() {
		return asigNomber;
	}


	public void setAsigNomber(String asigNomber) {
		this.asigNomber = asigNomber;
	}

	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public List<Asignatura_Estudiante> getAsignatura_Estudiante() {
		return Asignatura_Estudiante;
	}


	public void setAsignatura_Estudiante(List<Asignatura_Estudiante> asignatura_Estudiante) {
		Asignatura_Estudiante = asignatura_Estudiante;
	}


	public Asignatura() {
    }


	public Asignatura(Integer idAsig, String asigNomber, Profesor profesor, Curso curso) {
		super();
		this.idAsig = idAsig;
		this.asigNomber = asigNomber;
		this.profesor = profesor;
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "Asignatura [idAsig=" + idAsig + ", asigNomber=" + asigNomber + ", profesor=" + profesor + ", curso="
				+ curso + ", Asignatura_Estudiante=" + Asignatura_Estudiante + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Asignatura_Estudiante == null) ? 0 : Asignatura_Estudiante.hashCode());
		result = prime * result + ((asigNomber == null) ? 0 : asigNomber.hashCode());
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((idAsig == null) ? 0 : idAsig.hashCode());
		result = prime * result + ((profesor == null) ? 0 : profesor.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		if (Asignatura_Estudiante == null) {
			if (other.Asignatura_Estudiante != null)
				return false;
		} else if (!Asignatura_Estudiante.equals(other.Asignatura_Estudiante))
			return false;
		if (asigNomber == null) {
			if (other.asigNomber != null)
				return false;
		} else if (!asigNomber.equals(other.asigNomber))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (idAsig == null) {
			if (other.idAsig != null)
				return false;
		} else if (!idAsig.equals(other.idAsig))
			return false;
		if (profesor == null) {
			if (other.profesor != null)
				return false;
		} else if (!profesor.equals(other.profesor))
			return false;
		return true;
	}
	
	
	
}
