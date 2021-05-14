package br.javalee.springjavalee.repo;

import br.javalee.springjavalee.model.User;

public class UserRepo {
    public User findByEmailOrCpf(String email, String cpf);
    
    // @Query(value = "SELECT new User(u.nome, u.email) from User u where u.id = :cod")
    // public User buscaPorId(@Param("cod") int codigo);

    // @Query(value = "SELECT nome, email from usuario where id = :cod", nativeQuery = true)
    // public Object buscaPorIdNativo(@Param("cod") int codigo);;
}
