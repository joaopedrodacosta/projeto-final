package edu.mjv.school.projetofinal.controller;

import edu.mjv.school.projetofinal.model.Artista;
import edu.mjv.school.projetofinal.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artista")

public class ArtistaController {

    private ArtistaService artistaService;


    @Autowired
    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    public ArtistaController() {

    }

    @PostMapping("/salvar")
    public ResponseEntity<Artista> salvar(@RequestBody Artista artista) {
        Artista obj = artistaService.registrar(artista);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping
    public ResponseEntity<Artista> alterar(@RequestBody Artista artista) {
        Artista obj = artistaService.registrar(artista);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete ( @PathVariable int id){
        artistaService.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Artista>>listarTodos() {

        return ResponseEntity.ok(artistaService.findAll());
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Artista> findById(@PathVariable int id) {
        Artista obj = artistaService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}