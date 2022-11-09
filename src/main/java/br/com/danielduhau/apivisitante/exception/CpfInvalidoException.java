package br.com.danielduhau.apivisitante.exception;

//
public class CpfInvalidoException extends RuntimeException{

    public CpfInvalidoException(){
        super("Cpf invalido ou não informado");
    }
}
