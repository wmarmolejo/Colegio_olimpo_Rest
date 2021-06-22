package com.runt.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.colegio.entity.Colegio;
import com.runt.colegio.service.IColegioService;

@RestController
@RequestMapping(value = "/api/ColegioRest")
@CrossOrigin(origins = "*")
public class ColegioController {

    @Autowired
    private IColegioService iColegioService;
       
	 @GetMapping("/colegios")
	    private List<Colegio> getColegios() {
	        List<Colegio> resp = iColegioService.getColegios();
	        return resp;
	    }
}

 
