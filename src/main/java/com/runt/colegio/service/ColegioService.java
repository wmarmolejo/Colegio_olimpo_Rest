package com.runt.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.runt.colegio.entity.Colegio;
import com.runt.colegio.repository.IColegioRepository;

@Service
public class ColegioService implements IColegioService {

	@Autowired
	private IColegioRepository iColegioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Colegio> getColegios() {
		 List<Colegio> resp = (List<Colegio>) iColegioRepository.findAll();
		 return resp;
	}

}

