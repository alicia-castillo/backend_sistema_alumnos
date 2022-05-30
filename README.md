# backend_sistema_alumnos
backend con servicios para sistema alumnos
versiones
JDK 8
spring boot 2.6.8

endpoint: /alumnos
  -tipo get: listado de alumnos
  -tipo post: agrega nuevo alumno a la bd
  body:
  {
      nombre : string
      apellido_paterno : string
      apellido_materno : string
      fecha_nacimiento : string formato "yyyy-mm-dd"
      sexo : string (Femenino, Masculino)
      grado_estudios : string
      email : string
      telefono_alumno : string
  }
