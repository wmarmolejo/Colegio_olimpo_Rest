package com.runt.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.runt.colegio.entity.Curso;
import com.runt.colegio.repository.ICursoRepository;

@Service
public class CursoService implements ICursoService {

	@Autowired
	private ICursoRepository iCursoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso> getCrusos() {
		List<Curso> resp = (List<Curso>) iCursoRepository.findAll();
		 return resp;
	}

 
}
