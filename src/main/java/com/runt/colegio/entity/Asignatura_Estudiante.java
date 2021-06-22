package com.runt.colegio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel("Entity asignatura_estudiante")
@Table(name = "asignatura_estudiante")
public class Asignatura_Estudiante  implements java.io.Serializable {

	@Id
    @Column(name = "id_asigna_estu")
    private Integer idAsignaEstu;
	
    @ApiModelProperty("Relacion  asignatura_estudiante")
    @JsonIgnore
   	@JoinColumn(name = "Asignatura_id_asig")
   	@ManyToOne(optional = true)
    private Asignatura asignatura;

    @ApiModelProperty("Relacion asignatura_estudiante")
    @JsonIgnore
   	@JoinColumn(name = "Estudiante_id_estu")
   	@ManyToOne(optional = true)
    private Estudiante estudiante;

    
    
	public Asignatura_Estudiante() {
		super();
	}


	public Asignatura_Estudiante(Integer idAsignaEstu, Asignatura asignatura, Estudiante estudiante) {
		super();
		this.idAsignaEstu = idAsignaEstu;
		this.asignatura = asignatura;
		this.estudiante = estudiante;
	}


	public Integer getIdAsignaEstu() {
		return idAsignaEstu;
	}


	public void setIdAsignaEstu(Integer idAsignaEstu) {
		this.idAsignaEstu = idAsignaEstu;
	}


	public Asignatura getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	@Override
	public String toString() {
		return "Asignatura_Estudiante [idAsignaEstu=" + idAsignaEstu + ", asignatura=" + asignatura + ", estudiante="
				+ estudiante + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
		result = prime * result + ((estudiante == null) ? 0 : estudiante.hashCode());
		result = prime * result + ((idAsignaEstu == null) ? 0 : idAsignaEstu.hashCode());
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
		Asignatura_Estudiante other = (Asignatura_Estudiante) obj;
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		if (estudiante == null) {
			if (other.estudiante != null)
				return false;
		} else if (!estudiante.equals(other.estudiante))
			return false;
		if (idAsignaEstu == null) {
			if (other.idAsignaEstu != null)
				return false;
		} else if (!idAsignaEstu.equals(other.idAsignaEstu))
			return false;
		return true;
	}

    
    
}
