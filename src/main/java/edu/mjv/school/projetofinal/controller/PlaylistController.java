package edu.mjv.school.projetofinal.controller;

import edu.mjv.school.projetofinal.model.Playlist;
import edu.mjv.school.projetofinal.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    private PlaylistService playlistService;

    @Autowired
    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    public PlaylistController() {

    }

    @PostMapping("/salvar")
    public ResponseEntity<Playlist> salvar(@RequestBody Playlist playlist) {

        return ResponseEntity.ok(playlistService.registrar(playlist));
    }

    @PostMapping("/addMusica/{id}")
    public ResponseEntity<Playlist> addMusica(@PathVariable int id, @RequestParam String key) {

        return ResponseEntity.ok(playlistService.addMusicas(id, key));
    }


    @PostMapping("/addMusicasByArtista/{id}")
    public ResponseEntity<Playlist> addMusicasByArtista(@PathVariable int id, @RequestParam String key) {

        return ResponseEntity.ok(playlistService.addMusicasByArtista(id, key));
    }

    @PostMapping("/addMusicasByGenero/{id}")
    public ResponseEntity<Playlist> addMusicasByGenero(@PathVariable int  id, @RequestParam String key) {

        return ResponseEntity.ok(playlistService.addMusicasByGenero(id, key));
    }

    @PutMapping
    public ResponseEntity<Playlist> arterar(@RequestBody Playlist playlist) {

        return ResponseEntity.ok(playlistService.registrar(playlist));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete ( @PathVariable int id){
        playlistService.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Playlist> findById(@PathVariable int id) {
        Playlist obj = playlistService.findById(id);
        return ResponseEntity.ok().body(obj);
    }




}
