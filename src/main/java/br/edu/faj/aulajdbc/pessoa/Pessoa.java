package br.edu.faj.aulajdbc.pessoa;

import lombok.Data;

@Data
public class Pessoa {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;

}
