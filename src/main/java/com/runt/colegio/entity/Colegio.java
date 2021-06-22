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
@ApiModel("Entity Colegio")
@Table(name = "colegio")
public class Colegio implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_cole")
    private Integer idCole;

    @Column(name = "cole_nombre")
    private String asigNomber;
    
    @JsonIgnore
	@ApiModelProperty("Curso de colegios")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy="colegioIdCol")
	private List<Curso> cursos = new ArrayList<>();

	public Integer getIdCole() {
		return idCole;
	}

	public void setIdCole(Integer idCole) {
		this.idCole = idCole;
	}

	public String getAsigNomber() {
		return asigNomber;
	}

	public void setAsigNomber(String asigNomber) {
		this.asigNomber = asigNomber;
	}

	public Colegio(Integer idCole, String asigNomber) {
		super();
		this.idCole = idCole;
		this.asigNomber = asigNomber;
	}
	
	public Colegio() {
		// TODO Auto-generated constructor stub
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Colegio [idCole=" + idCole + ", asigNomber=" + asigNomber + ", cursos=" + cursos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asigNomber == null) ? 0 : asigNomber.hashCode());
		result = prime * result + ((cursos == null) ? 0 : cursos.hashCode());
		result = prime * result + ((idCole == null) ? 0 : idCole.hashCode());
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
		Colegio other = (Colegio) obj;
		if (asigNomber == null) {
			if (other.asigNomber != null)
				return false;
		} else if (!asigNomber.equals(other.asigNomber))
			return false;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		if (idCole == null) {
			if (other.idCole != null)
				return false;
		} else if (!idCole.equals(other.idCole))
			return false;
		return true;
	}
	
	

}
