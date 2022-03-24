package edu.mjv.school.projetofinal.controller;

import edu.mjv.school.projetofinal.model.Genero;
import edu.mjv.school.projetofinal.model.Musica;
import edu.mjv.school.projetofinal.model.Playlist;
import edu.mjv.school.projetofinal.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/musica")


    public class MusicaController {

        private MusicaService musicaService;


        @Autowired
        public MusicaController(MusicaService musicaService) {
            this.musicaService = musicaService;
        }

        public MusicaController() {

        }

        @PostMapping("/salvar")
        public ResponseEntity<Musica> salvar(@RequestBody Musica musica) {
            return ResponseEntity.ok(musicaService.save(musica));
        }

        @PutMapping
        public ResponseEntity<Musica> arterar(@RequestBody Musica musica) {
        return ResponseEntity.ok(musicaService.save(musica));
    }

        @DeleteMapping("/{id}")
        public ResponseEntity delete ( @PathVariable int id){
        musicaService.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

        @GetMapping(value = "/{id}")
        public ResponseEntity<Musica> findById(@PathVariable int id) {
        Musica obj = musicaService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

        @GetMapping("/listarTodos")
        public ResponseEntity<List<Musica>>listarTodos() {
        return ResponseEntity.ok(musicaService.listAll());
    }

    }
