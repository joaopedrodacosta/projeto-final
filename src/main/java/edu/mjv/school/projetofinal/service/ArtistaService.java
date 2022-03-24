package edu.mjv.school.projetofinal.service;

import edu.mjv.school.projetofinal.model.Artista;
import edu.mjv.school.projetofinal.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;

    public ArtistaService(ArtistaRepository artistaRepository){
        this.artistaRepository = artistaRepository;
    }

    public List<Artista> findAll(){
        return artistaRepository.findAll();
    }

    public Artista findByName(String keyword) {
        Artista artista = artistaRepository.findByName(keyword);
        return artista;
    }

    public Artista registrar(Artista artista){
        return artistaRepository.save(artista);

    }

    public void delete(int id) {
        artistaRepository.delete(findById(id));
    }

    public Artista findById(int id) {
        Optional<Artista> result = artistaRepository.findById(id);
        Artista theAuthor = null;
        if (result.isPresent()) {
            theAuthor = result.get();
        }
        else {
            // artista não encontrado
            throw new RuntimeException("Não foi possível achar o artista - " + id);
        }
        return theAuthor;
    }
}
