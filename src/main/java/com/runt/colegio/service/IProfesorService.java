package com.runt.colegio.service;

import java.util.List;

import com.runt.colegio.dto.ProfesoresConAsignaturasDTO;
import com.runt.colegio.entity.Profesor;

public interface IProfesorService {
	
	  List<Profesor> getProfesores();
//	  List<ProfesoresConAsignaturasDTO> getProfesoresConAsignaturas();
	  public List<ProfesoresConAsignaturasDTO> findAllProfesoresConAsignaturasCursos();
}
