package br.com.danielduhau.apivisitante.service;

import br.com.danielduhau.apivisitante.dto.VisitanteRequestDto;
import br.com.danielduhau.apivisitante.model.Visitante;
import br.com.danielduhau.apivisitante.repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VisitanteService {

    //Usando o final porque o objeto é uma instância da camada de banco e não vai ser alterado e também
    //porque a anotação do lombok @RequiredArgsConstructor para injetar o construtor precisa que seja final.
    private final VisitanteRepository repository;

    public Visitante criar(VisitanteRequestDto dto){
        var id = UUID.randomUUID().toString();
        var visitante = new Visitante(id, dto.getCpf(), dto.getNome());
        return repository.save(visitante);

    }
}
