package br.javalee.springjavalee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.javalee.springjavalee.dto.ContagemTransacao;

import br.javalee.springjavalee.repo.TransacaoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/transacao")
public class TransacaoController {
    
    @Autowired
    private TransacaoRepo repo;
    
    @GetMapping("/consulta/{id}")
    public List<ContagemTransacao> getAgtFin(@PathVariable int id){
        List<ContagemTransacao> transacao = repo.countTransacaoPorAgente(id);
        return transacao;
    }

    @GetMapping("/consulta/all")
    public List<ContagemTransacao> getAllTransactions(){
        List<ContagemTransacao> transacao = repo.countTransacaoAll();
        return transacao;
    }
}
