package com.runt.colegio.controller;


import com.runt.colegio.entity.Asignatura;
import com.runt.colegio.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/AsignaturaRest")
@CrossOrigin(origins = "*")
public class AsignaturaController {


    @Autowired
    private IAsignaturaService iAsignaturaService;

    @GetMapping("/asignaturas")
    private List<Asignatura> getAsignaturas() {
        List<Asignatura> resp = iAsignaturaService.getAsignaturas();
        return resp;
    }


}
