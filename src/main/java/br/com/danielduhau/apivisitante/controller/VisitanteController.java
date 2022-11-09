package br.com.danielduhau.apivisitante.controller;

import br.com.danielduhau.apivisitante.dto.VisitanteRequestDto;
import br.com.danielduhau.apivisitante.model.Visitante;
import br.com.danielduhau.apivisitante.service.VisitanteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {

    private final VisitanteService service;

    public VisitanteController(VisitanteService service){

        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visitante criar(@RequestBody VisitanteRequestDto visitanteRequestDto){

        return service.criar(visitanteRequestDto);
    }
}
