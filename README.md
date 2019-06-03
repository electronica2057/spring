# FORTABAT-WEBSERVICES

#ALUMNOS


#GET /api/alumnos

trae la lista completa de alumnos existentes en la base de datos


#POST /api/alumnos

crea un nuevo alumno


#PUT /api/alumnos/{id}

actualiza un alumno... investigar como hacerlo


NO SOPORTA DELETE ya que segun la logica deberia borrar todos los alumnos



#GET /api/alumnos/{id}

devuelve un alumno especifico.... estaria bueno implementar hateoas


NO SOPORTA POST para un id determinado ya que el alumno existe



#DELETE /api/alumnos/{id}

elimina un alumno especifico



#GET /api/alumnos/{id}/cursos

devuelve la lista de cursos para el alumno especifico






CURSOS


#GET /api/cursos

devuelve todos los cursos existentes en la base de datos


#POST /api/cursos

crea un nuevo alumno


#PUT /api/cursos/{id}

actualiza el curso


#GET /api/cursos/{id}

devuelve un curso especifico


#DELETE /api/cursos/{id}

elimina un curso especifico


#GET /api/cursos/{id}/alumnos

devuelve la lista de alumnos para un curso especifico




#Docentes


#GET /api/docentes

devuelve la lista completa de los docentes

#POST /api/docentes

agrega un docente


#PUT /api/docentes/{id}

actualiza un docente

#GET /api/docentes/{id}

devuelve un docente especificado por id

#GET /api/docentes/{id}/cursos

devuelve la lista de cursos asignados al docente

#GET /api/docentes/{id}/alumnos

devuelve los alumnos de un profesor particular... 
podria servir para crear la lista de ingresos











