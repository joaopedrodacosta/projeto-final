package edu.mjv.school.projetofinal.controller;


import edu.mjv.school.projetofinal.model.Usuario;
import edu.mjv.school.projetofinal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    public UserController() {

    }

    @PostMapping("/salvar")
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(userService.save(usuario));
    }

    @PutMapping
    public ResponseEntity<Usuario> arterar(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(userService.save(usuario));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete ( @PathVariable int id){
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable int id) {
        Usuario obj = userService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Usuario>> listarTodos () {
        return ResponseEntity.ok(userService.listAll());
    }



    }









