package com.runt.colegio.service;

import com.runt.colegio.entity.Asignatura;
import com.runt.colegio.repository.IAsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AsignaturaService implements IAsignaturaService {

    @Autowired
    private IAsignaturaRepository iAsignaturaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Asignatura> getAsignaturas() {

        List<Asignatura> resp = (List<Asignatura>) iAsignaturaRepository.findAll();
        return resp;

    }
    
    
    
}
