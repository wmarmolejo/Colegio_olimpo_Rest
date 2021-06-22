package com.runt.colegio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel("Entity Curso")
@Table(name = "curso")
public class Curso implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_cur")
    private Integer idCurso;

    @Column(name = "salon")
    private String cursoSalon;
    
    @Column(name = "grado")
    private Integer cursoGrado;
    
     
    @ApiModelProperty("Colegio de cursos")
	@JoinColumn(name = "id_cole")
	@ManyToOne(optional = true)
    private Colegio colegioIdCol;
        	
    @JsonIgnore
 	@ApiModelProperty("Curso de asignaturas")
 	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy="idAsig")
 	private List<Asignatura> asignaturas = new ArrayList<>();
    
	public Curso() {
		// TODO Auto-generated constructor stub
	}


	public Curso(Integer idCurso, String cursoSalon, Integer cursoGrado, Colegio colegioIdCol) {
		super();
		this.idCurso = idCurso;
		this.cursoSalon = cursoSalon;
		this.cursoGrado = cursoGrado;
		this.colegioIdCol = colegioIdCol;
	}



	public Integer getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}


	public String getCursoSalon() {
		return cursoSalon;
	}


	public void setCursoSalon(String cursoSalon) {
		this.cursoSalon = cursoSalon;
	}


	public Integer getCursoGrado() {
		return cursoGrado;
	}


	public void setCursoGrado(Integer cursoGrado) {
		this.cursoGrado = cursoGrado;
	}
	
	public Colegio getColegioIdCol() {
		return colegioIdCol;
	}


	public void setColegioIdCol(Colegio colegioIdCol) {
		this.colegioIdCol = colegioIdCol;
	}


	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}


	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", cursoSalon=" + cursoSalon + ", cursoGrado=" + cursoGrado
				+ ", colegioIdCol=" + colegioIdCol + ", asignaturas=" + asignaturas + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignaturas == null) ? 0 : asignaturas.hashCode());
		result = prime * result + ((colegioIdCol == null) ? 0 : colegioIdCol.hashCode());
		result = prime * result + ((cursoGrado == null) ? 0 : cursoGrado.hashCode());
		result = prime * result + ((cursoSalon == null) ? 0 : cursoSalon.hashCode());
		result = prime * result + ((idCurso == null) ? 0 : idCurso.hashCode());
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
		Curso other = (Curso) obj;
		if (asignaturas == null) {
			if (other.asignaturas != null)
				return false;
		} else if (!asignaturas.equals(other.asignaturas))
			return false;
		if (colegioIdCol == null) {
			if (other.colegioIdCol != null)
				return false;
		} else if (!colegioIdCol.equals(other.colegioIdCol))
			return false;
		if (cursoGrado == null) {
			if (other.cursoGrado != null)
				return false;
		} else if (!cursoGrado.equals(other.cursoGrado))
			return false;
		if (cursoSalon == null) {
			if (other.cursoSalon != null)
				return false;
		} else if (!cursoSalon.equals(other.cursoSalon))
			return false;
		if (idCurso == null) {
			if (other.idCurso != null)
				return false;
		} else if (!idCurso.equals(other.idCurso))
			return false;
		return true;
	}


	
	

}
