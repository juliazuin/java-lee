package br.javalee.springjavalee.repo;

import org.springframework.data.repository.CrudRepository;

import br.javalee.springjavalee.models.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);
}
