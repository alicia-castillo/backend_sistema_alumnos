package com.sistemaAlumnos.repo;

import com.sistemaAlumnos.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repoAlumnos extends JpaRepository<Alumno, Integer> {
    
}
