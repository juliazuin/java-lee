package br.javalee.springjavalee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.javalee.springjavalee.models.AgenteFinanceiro;
import br.javalee.springjavalee.repo.AgenteFinanceiroRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/AgenteFinanceiro")
public class AgenteFinanceiroController {
    
    @Autowired
    private AgenteFinanceiroRepo repo;

    @GetMapping("/agentes")
    public List<AgenteFinanceiro> agtFin(){
        List<AgenteFinanceiro> agtFin = repo.findTop10ByOrderByVolumeTransacionalDesc();
        return agtFin;
    }
}
