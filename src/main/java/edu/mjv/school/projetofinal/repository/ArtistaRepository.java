package edu.mjv.school.projetofinal.repository;


import edu.mjv.school.projetofinal.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {
    @Query("Select a from Artista a where a.nome LIKE %?1%")
    Artista findByName(String keyword);

}
