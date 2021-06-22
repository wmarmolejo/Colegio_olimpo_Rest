package com.runt.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.runt.colegio.entity.Asignatura;
import com.runt.colegio.entity.Curso;

public interface ICursoRepository  extends CrudRepository<Curso, Integer> {
	
	@Query("SELECT cur FROM Curso cur, Asignatura a, Profesor p  WHERE cur.idCurso=a.curso.idCurso and p.idPro=a.profesor.idPro and p.idPro=?1")
	public List<Curso> findAsignaturaByProfesor(Integer id);
}
