package com.runt.colegio.repository;

import com.runt.colegio.dto.ProfesoresConAsignaturasDTO;
import com.runt.colegio.entity.Asignatura;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IAsignaturaRepository extends CrudRepository<Asignatura, Integer> {
	
	@Query("SELECT a FROM Profesor p, Asignatura a WHERE p.idPro=a.profesor.idPro and p.idPro=?1")
	public List<Asignatura> findByProfesor(Integer id);
	
	
}
