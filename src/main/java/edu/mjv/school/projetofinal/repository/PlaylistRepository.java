package edu.mjv.school.projetofinal.repository;


import edu.mjv.school.projetofinal.model.Musica;
import edu.mjv.school.projetofinal.model.Playlist;
import edu.mjv.school.projetofinal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
    List<Playlist> findByUsuario(Usuario usuario );


}
