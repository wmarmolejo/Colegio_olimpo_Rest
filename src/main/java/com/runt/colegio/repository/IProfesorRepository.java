package com.runt.colegio.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.runt.colegio.dto.ProfesoresConAsignaturasDTO;
import com.runt.colegio.entity.Curso;
import com.runt.colegio.entity.Profesor;
 

public interface IProfesorRepository  extends CrudRepository<Profesor, Integer> {
	
	//TODO
//	@Query("SELECT new com.runt.colegio.dto.ProfesoresConAsignaturasDTO(p,a,c) FROM Profesor p, Asignatura a, Curso c WHERE p.idPro=a.profesor.idPro and c.idCurso=a.curso.idCurso")
//	public List<ProfesoresConAsignaturasDTO> findAllActiveUsers();

 
}
