package com.runt.colegio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.runt.colegio.dto.ProfesoresConAsignaturasDTO;
import com.runt.colegio.entity.Asignatura;
import com.runt.colegio.entity.Colegio;
import com.runt.colegio.entity.Curso;
import com.runt.colegio.entity.Profesor;
import com.runt.colegio.repository.IAsignaturaRepository;
import com.runt.colegio.repository.IColegioRepository;
import com.runt.colegio.repository.ICursoRepository;
import com.runt.colegio.repository.IProfesorRepository;

@Service
public class ProfesorService implements IProfesorService {

	@Autowired
	private IProfesorRepository iProfesorRepository;
	

	@Autowired
	private ICursoRepository iCursoRepository;
	
    @Autowired
    private IAsignaturaRepository iAsignaturaRepository;
    
    
	@Override
	@Transactional(readOnly = true)
	public List<Profesor> getProfesores() {
		 List<Profesor> resp = (List<Profesor>) iProfesorRepository.findAll();
		 return resp;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ProfesoresConAsignaturasDTO> findAllProfesoresConAsignaturasCursos() {
		List<Profesor> resp = (List<Profesor>) iProfesorRepository.findAll();
		List<ProfesoresConAsignaturasDTO> listasDTO=new ArrayList<>();
		
		resp.forEach(x -> {
			List<Asignatura> asignatura=iAsignaturaRepository.findByProfesor(x.getIdPro());
			List<Curso> cursos=iCursoRepository.findAsignaturaByProfesor(x.getIdPro());			
			listasDTO.add(new ProfesoresConAsignaturasDTO(x,asignatura,cursos));
		} );
		return listasDTO;
	}
	

}



 
