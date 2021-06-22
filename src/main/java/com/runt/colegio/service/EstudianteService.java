package com.runt.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.runt.colegio.entity.Estudiante;
import com.runt.colegio.repository.IEstudianteRepository;

@Service
public class EstudianteService implements IEstudianteService {

	@Autowired
	private IEstudianteRepository iEstudianteRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> findByAsignatura(Integer id) {
		 List<Estudiante> resp = (List<Estudiante>) iEstudianteRepository.findByAsignatura(id);
		 return resp;		 
	}

	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> getEstudiantes() {
		List<Estudiante> resp = (List<Estudiante>) iEstudianteRepository.findAll();
		 return resp;
	}

 
}
