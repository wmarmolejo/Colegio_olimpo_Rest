package com.runt.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.colegio.entity.Curso;
import com.runt.colegio.service.ICursoService;

@RestController
@RequestMapping(value = "/api/CursoRest")
@CrossOrigin(origins = "*")
public class CursoController {

    @Autowired
    private ICursoService iCursoService;
       
	 @GetMapping("/cursos")
	    private List<Curso> getColegios() {
	        List<Curso> resp = iCursoService.getCrusos();
	        return resp;
	    }
}

 
