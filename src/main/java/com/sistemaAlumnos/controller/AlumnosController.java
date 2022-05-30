package com.sistemaAlumnos.controller;

import com.sistemaAlumnos.entity.Alumno;
import com.sistemaAlumnos.servicios.servicioAlumnos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
    @Autowired
    private servicioAlumnos servicioAlumno;
    
    @CrossOrigin
    @GetMapping
    public List<Alumno> getAlumnos(){
        
        return servicioAlumno.consultar();
    }
    
    @CrossOrigin
    @PostMapping
    public Alumno addAlumno(@RequestBody Alumno alumno){
        return servicioAlumno.insertar(alumno);
    }
}
