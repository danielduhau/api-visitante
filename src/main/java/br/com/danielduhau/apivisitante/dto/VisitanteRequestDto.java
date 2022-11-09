package br.com.danielduhau.apivisitante.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitanteRequestDto {

    private String cpf;
    private String nome;

}
