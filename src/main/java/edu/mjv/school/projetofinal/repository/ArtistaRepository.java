package edu.mjv.school.projetofinal.repository;


import edu.mjv.school.projetofinal.model.Artista;
import edu.mjv.school.projetofinal.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {
    @Query("Select a from Artista a where a.nome LIKE %?1%")
    Artista findByName(String keyword);

}
