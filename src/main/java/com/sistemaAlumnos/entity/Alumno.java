package com.sistemaAlumnos.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_alumno;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nacimiento;
    private String sexo;
    private String grado_estudios;
    @Column(unique = true)
    private String email;
    private String telefono_alumno;
    
    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setGrado_estudios(String grado_estudios) {
        this.grado_estudios = grado_estudios;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono_alumno(String telefono_alumno) {
        this.telefono_alumno = telefono_alumno;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getGrado_estudios() {
        return grado_estudios;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono_alumno() {
        return telefono_alumno;
    }
}
