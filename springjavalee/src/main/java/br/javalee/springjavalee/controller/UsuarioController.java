package br.javalee.springjavalee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.javalee.springjavalee.models.Usuario;
import br.javalee.springjavalee.repo.UsuarioRepo;

@RestController
@CrossOrigin("*") // aceita requisições de outras origens
/*@RequestMapping("/user")
public class UsuarioController {

    @Autowired // injecao
    private UsuarioRepo repo;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userParam) {
        // User user = repo.findByEmailAndSenha(userParam.getEmail(),
        // userParam.getSenha());
        Usuario user = repo.findByEmailOrRacf(userParam.getEmail(), userParam.getRacf());

        if (user != null) {
            if (userParam.getSenha().equals(user.getSenha())) {
                return ResponseEntity.ok(user); // OK == 200
            }
        }
        return ResponseEntity.status(404).build();
    }

}*/

@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
public class UsuarioController {
    @Autowired // injecao
    private UsuarioRepo repo;

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String senha) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Usuario n = new Usuario();
        n.setNome(name);
        n.setSenha(senha);
        repo.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Usuario> getAllUsers() {
        // This returns a JSON or XML with the users
        return repo.findAll();
    }
}