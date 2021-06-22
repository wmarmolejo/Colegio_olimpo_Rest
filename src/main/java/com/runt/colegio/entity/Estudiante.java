package com.runt.colegio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel("Entity Estudiante")
@Table(name = "estudiante")
public class Estudiante implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_estu")
    private Integer idEst;

    @Column(name = "estu_nombre")
    private String estNombre;
    
    @JsonIgnore
 	@ApiModelProperty("Asignatura de estudiante")
 	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy="estudiante")
 	private List<Asignatura_Estudiante> Asignatura_Estudiante = new ArrayList<>();
     
	public Estudiante() {
		super();
	}


	public Estudiante(Integer idEst, String estNombre) {
		super();
		this.idEst = idEst;
		this.estNombre = estNombre;
	}


	public Integer getIdEst() {
		return idEst;
	}


	public void setIdEst(Integer idEst) {
		this.idEst = idEst;
	}

	public String getEstNombre() {
		return estNombre;
	}


	public void setEstNombre(String estNombre) {
		this.estNombre = estNombre;
	}


	public List<Asignatura_Estudiante> getAsignatura_Estudiante() {
		return Asignatura_Estudiante;
	}


	public void setAsignatura_Estudiante(List<Asignatura_Estudiante> asignatura_Estudiante) {
		Asignatura_Estudiante = asignatura_Estudiante;
	}


	@Override
	public String toString() {
		return "Estudiante [idEst=" + idEst + ", estNombre=" + estNombre + ", Asignatura_Estudiante="
				+ Asignatura_Estudiante + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Asignatura_Estudiante == null) ? 0 : Asignatura_Estudiante.hashCode());
		result = prime * result + ((estNombre == null) ? 0 : estNombre.hashCode());
		result = prime * result + ((idEst == null) ? 0 : idEst.hashCode());
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
		Estudiante other = (Estudiante) obj;
		if (Asignatura_Estudiante == null) {
			if (other.Asignatura_Estudiante != null)
				return false;
		} else if (!Asignatura_Estudiante.equals(other.Asignatura_Estudiante))
			return false;
		if (estNombre == null) {
			if (other.estNombre != null)
				return false;
		} else if (!estNombre.equals(other.estNombre))
			return false;
		if (idEst == null) {
			if (other.idEst != null)
				return false;
		} else if (!idEst.equals(other.idEst))
			return false;
		return true;
	}

 
 
}
