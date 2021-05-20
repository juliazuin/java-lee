package br.javalee.springjavalee.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import br.javalee.springjavalee.dto.ContagemTransacao;
import br.javalee.springjavalee.models.Transacao;

public interface TransacaoRepo extends CrudRepository<Transacao, Integer> {

    @Query("Select new br.javalee.springjavalee.dto.ContagemTransacao(t.agenteFinanceiro.nomeAgente, t.agenteFinanceiro.volumeTransacional,t.status, Count(t.status)) From Transacao as t where t.agenteFinanceiro.idAgente =?1 group by t.agenteFinanceiro.nomeAgente, t.status order by t.status")
    public List<ContagemTransacao> countTransacaoPorAgente(int id);   
}
