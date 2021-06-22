package com.runt.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.runt.colegio.entity.Estudiante;

public interface IEstudianteRepository extends CrudRepository<Estudiante, Integer> {
	
	@Query("SELECT e FROM  Asignatura a,Asignatura_Estudiante ae, Estudiante e"
			+ " WHERE a.idAsig=ae.asignatura.idAsig and ae.estudiante.idEst=e.idEst and a.idAsig=?1")
	public List<Estudiante> findByAsignatura(Integer id);
}
