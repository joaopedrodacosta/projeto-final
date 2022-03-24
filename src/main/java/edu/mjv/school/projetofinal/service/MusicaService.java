package edu.mjv.school.projetofinal.service;

import edu.mjv.school.projetofinal.model.Genero;
import edu.mjv.school.projetofinal.model.Musica;
import edu.mjv.school.projetofinal.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository){
        this.musicaRepository = musicaRepository;

    }

    public Musica save(Musica musica){
        return musicaRepository.save(musica);
    }

    public void delete(int id) {
        musicaRepository.delete(findById(id));
    }

    public List<Musica> findByArtista(String key){
        return  musicaRepository.findArtistaMusicas(key);
    }

    public List<Musica> findByGenero(Genero genero){
        return  musicaRepository.findByGenero(genero);
    }

    public List<Musica> listAll(){
        return musicaRepository.findAll();
    }

    public Musica findById(int id) {
        Optional<Musica> result = musicaRepository.findById(id);
        Musica theMusic = null;
        if (result.isPresent()) {
            theMusic = result.get();
        }
        else {
            // artista não encontrado
            throw new RuntimeException("Não foi possível achar o artista - " + id);
        }
        return theMusic;
    }

}
