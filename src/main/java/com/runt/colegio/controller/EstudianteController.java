package com.runt.colegio.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.colegio.dto.ProfesoresConAsignaturasDTO;
import com.runt.colegio.entity.Estudiante;
import com.runt.colegio.service.IEstudianteService;

@RestController
@RequestMapping(value = "/api/EstudianteRest")
@CrossOrigin(origins = "*")
public class EstudianteController {
	
	
	   @Autowired
	    private IEstudianteService iEstudianteService;
	       
		 @GetMapping("/Estudiantes")
	    private List<Estudiante> getEstudiantes() {
	        List<Estudiante> resp = iEstudianteService.getEstudiantes();
	        return resp;
	    }

		 @GetMapping("/EstudianteByAsignatura/{idAsignatura}")
	    private List<Estudiante> findByAsignatura(@PathVariable("idAsignatura") Integer idAsignatura) {
	        List<Estudiante> resp = iEstudianteService.findByAsignatura(idAsignatura);
	        return resp;
	    }

}
