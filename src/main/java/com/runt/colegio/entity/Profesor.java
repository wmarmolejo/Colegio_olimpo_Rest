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
@ApiModel("Entity Profesor")
@Table(name = "profesor")
public class Profesor implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_pro")
    private Integer idPro;

    @Column(name = "pro_nombre")
    private String proNomber;
    
    @JsonIgnore
	@ApiModelProperty("Profesor de asignaturas")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy="idAsig")
	private List<Asignatura> asignaturas = new ArrayList<>();
    
	public Profesor() {
		super();
	}


	public Profesor(Integer idPro, String proNomber) {
		super();
		this.idPro = idPro;
		this.proNomber = proNomber;
	}


	public Integer getIdPro() {
		return idPro;
	}


	public void setIdPro(Integer idPro) {
		this.idPro = idPro;
	}


	public String getProNomber() {
		return proNomber;
	}


	public void setProNomber(String proNomber) {
		this.proNomber = proNomber;
	}


	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}


	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}


	@Override
	public String toString() {
		return "Profesor [idPro=" + idPro + ", proNomber=" + proNomber + ", asignaturas=" + asignaturas + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignaturas == null) ? 0 : asignaturas.hashCode());
		result = prime * result + ((idPro == null) ? 0 : idPro.hashCode());
		result = prime * result + ((proNomber == null) ? 0 : proNomber.hashCode());
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
		Profesor other = (Profesor) obj;
		if (asignaturas == null) {
			if (other.asignaturas != null)
				return false;
		} else if (!asignaturas.equals(other.asignaturas))
			return false;
		if (idPro == null) {
			if (other.idPro != null)
				return false;
		} else if (!idPro.equals(other.idPro))
			return false;
		if (proNomber == null) {
			if (other.proNomber != null)
				return false;
		} else if (!proNomber.equals(other.proNomber))
			return false;
		return true;
	}
 

	
	

}
