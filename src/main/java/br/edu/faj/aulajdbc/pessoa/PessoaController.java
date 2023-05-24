package br.edu.faj.aulajdbc.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {
    @Autowired PessoaDao dao;
    @PostMapping("/pessoa")
    public Pessoa incluir(@RequestBody Pessoa p) {
        return dao.incluir(p);
    }

}
