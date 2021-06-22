package com.runt.colegio.service;

import java.util.List;
import com.runt.colegio.entity.Estudiante; 

public interface IEstudianteService {
	
	List<Estudiante> getEstudiantes();
	public List<Estudiante> findByAsignatura(Integer id);
}
