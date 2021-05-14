package br.javalee.springjavalee.repo;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.javalee.springjavalee.models.AgenteFinanceiro;

public interface AgenteFinanceiroRepo extends CrudRepository<AgenteFinanceiro, Integer>{
                            
    @Query(value = "Select * from mtb310_ag_financeiro order by volume_transacional Desc",nativeQuery = true)
    public List<AgenteFinanceiro> top10();
}
