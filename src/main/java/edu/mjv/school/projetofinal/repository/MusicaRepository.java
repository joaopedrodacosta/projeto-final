package edu.mjv.school.projetofinal.repository;

import edu.mjv.school.projetofinal.model.Genero;
import edu.mjv.school.projetofinal.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Integer> {

    @Query("Select m from Musica m left join Artista a on m.artista = a.id where a.nome = :keyword")
    List<Musica> findArtistaMusicas(String keyword);

    List<Musica> findByGenero(Genero genero);
}
