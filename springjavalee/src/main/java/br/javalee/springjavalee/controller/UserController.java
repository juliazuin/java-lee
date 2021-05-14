package br.javalee.springjavalee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.javalee.springjavalee.model.User;
import br.javalee.springjavalee.repo.UserRepo;

@RestController
@CrossOrigin("*") // aceita requisições de outras origens
@RequestMapping("/user")
public class UserController {

    @Autowired // injecao
    private UserRepo repo;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User userParam) {
        // User user = repo.findByEmailAndSenha(userParam.getEmail(),
        // userParam.getSenha());
        User user = repo.findByEmailOrCpf(userParam.getEmail(), userParam.getCpf());

        if (user != null) {
            if (userParam.getSenha().equals(user.getSenha())) {
                return ResponseEntity.ok(user); // OK == 200
            }
        }
        return ResponseEntity.status(404).build();
    }
    
}
