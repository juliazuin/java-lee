package br.javalee.springjavalee.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.javalee.springjavalee.models.AgenteFinanceiro;

public interface AgenteFinanceiroRepo extends CrudRepository<AgenteFinanceiro, Integer>{
    public List<AgenteFinanceiro> findTop10ByOrderByVolumeTransacionalDesc();
}
