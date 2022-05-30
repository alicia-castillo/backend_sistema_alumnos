package com.sistemaAlumnos.servicios;

import com.sistemaAlumnos.entity.Alumno;
import com.sistemaAlumnos.repo.repoAlumnos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class servicioAlumnos {
    @Autowired
    private repoAlumnos alumnoRepo;
    
    public Alumno insertar(Alumno alumno){
        return alumnoRepo.save(alumno);
    }
    
    public List<Alumno> consultar(){
        
        return alumnoRepo.findAll();
    }
}
