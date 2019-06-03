package com.fortabat.webservice.controller;

import com.fortabat.webservice.model.Docente;
import com.fortabat.webservice.model.container.DataDocentes;
import com.fortabat.webservice.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/api")
public class DocenteController {
    @Autowired
    DocenteService docenteService;

    @PostMapping(value = "/docentes", headers = "Accept= application/json") // Map ONLY GET Requests
    public ResponseEntity<Docente> addCurso(@RequestBody Docente docente) {

        docenteService.agregarDocente(docente);
        HttpHeaders header = new HttpHeaders();

        return new ResponseEntity<>(header, HttpStatus.CREATED);


    }

    @GetMapping(path = "/docentes")
    public @ResponseBody
    DataDocentes listaDocentes() {
        List<Docente> docenteList = docenteService.listarDocentes();
        DataDocentes dataDocentes = new DataDocentes();
        dataDocentes.setDocenteList(docenteList);

        return dataDocentes;
    }

    @GetMapping(path = "/docentes/{id}")
    public @ResponseBody
    Optional<Docente> retrieveDocente(@PathVariable int id) {
        Optional<Docente> a = Optional.ofNullable(docenteService.getById(id));
        if (!a.isPresent()) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        return a;
    }
}
