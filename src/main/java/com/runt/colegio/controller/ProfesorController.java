package com.runt.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.colegio.dto.ProfesoresConAsignaturasDTO;
import com.runt.colegio.entity.Profesor; 
import com.runt.colegio.service.IProfesorService;
 
@RestController
@RequestMapping(value = "/api/profesorRest")
@CrossOrigin(origins = "*")
public class ProfesorController {

    @Autowired
    private IProfesorService iProfesorService;
       
	 @GetMapping("/profesores")
    private List<Profesor> getProfesores() {
        List<Profesor> resp = iProfesorService.getProfesores();
        return resp;
    }

	 @GetMapping("/profesoresAsignatura")
    private List<ProfesoresConAsignaturasDTO> findAllProfesoresConAsignaturasCursos() {
        List<ProfesoresConAsignaturasDTO> resp = iProfesorService.findAllProfesoresConAsignaturasCursos();
        return resp;
    }
	 

}

 
