package edu.mjv.school.projetofinal.service;

import edu.mjv.school.projetofinal.exception.ObjNotFoundException;
import edu.mjv.school.projetofinal.model.Genero;
import edu.mjv.school.projetofinal.model.Musica;
import edu.mjv.school.projetofinal.model.Playlist;
import edu.mjv.school.projetofinal.repository.MusicaRepository;
import edu.mjv.school.projetofinal.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository playlistRepository;

    @Autowired
    private MusicaRepository musicaRepository;

    public Playlist registrar(Playlist playlist){
        return playlistRepository.save(playlist);

    }

    public Playlist addMusicas(int id, String key){
        Optional<Playlist> result = playlistRepository.findById(id);
        List<Musica> musicas = musicaRepository.findArtistaMusicas(key);
        Playlist thePlay = null;
        List<Musica> aux = null;
            if(result.isPresent()){
                thePlay = result.get();
                aux =Stream.concat(thePlay.getMusicas().stream(), musicas.stream()).collect(Collectors.toList());
                thePlay.setMusicas(aux);
            }
            else {
                throw new ObjNotFoundException("Não foi possível achar a playlist "+id);
            }

        return playlistRepository.save(thePlay);

    }
    public Playlist addMusicasByGenero(int id, String key){
        Genero genero = Genero.valueOf(key);
        Optional<Playlist> result = playlistRepository.findById(id);
        List<Musica> musicas = musicaRepository.findByGenero(genero);
        Playlist thePlay = null;
        List<Musica> aux = null;
        if(result.isPresent()){
            thePlay = result.get();
            aux =Stream.concat(thePlay.getMusicas().stream(), musicas.stream()).collect(Collectors.toList());
            thePlay.setMusicas(musicas);
        }
        else {
            throw new ObjNotFoundException("Não foi possível achar a playlist "+ id);
        }

        return playlistRepository.save(thePlay);

    }

    public void delete(int id) {
        playlistRepository.delete(findById(id));
    }

    public Playlist findById(int id) {
        Optional<Playlist> result = playlistRepository.findById(id);
        Playlist thePlay = null;
        if (result.isPresent()) {
            thePlay = result.get();
        }
        else {
            // playlist não encontrada
            throw new ObjNotFoundException("Não foi possível achar a playlist- " + id);
        }
        return thePlay;
    }

    public List<Playlist> findAll(){
        return playlistRepository.findAll();
    }
}
