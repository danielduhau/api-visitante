package br.com.danielduhau.apivisitante.validation;

import br.com.danielduhau.apivisitante.dto.VisitanteRequestDto;
import br.com.danielduhau.apivisitante.exception.CpfInvalidoException;

import java.util.Optional;
import java.util.function.Predicate;

public class VisitanteValidation {

    private VisitanteValidation() {}

    public static void validarCriacaoVisitante(VisitanteRequestDto dto){
        Optional.ofNullable(dto.getCpf()).filter(Predicate.not(String::isEmpty)).orElseThrow(CpfInvalidoException::new);
    }
}
