package edu.mjv.school.projetofinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "playlist")
public class Playlist {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(length = 80)
        private String nome;


        @ManyToOne
        @JoinColumn(name = "usuario_id")
        private Usuario usuario;

        @OneToMany(cascade= CascadeType.PERSIST)
        private List<Musica> musicas;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public Usuario getUsuario() {
                return usuario;
        }

        public void setUsuario(Usuario usuario) {
                this.usuario = usuario;
        }


        public List<Musica> getMusicas() {
                return musicas;
        }



        public void setMusicas(List<Musica> musicas) {
                this.musicas = musicas;
        }


}
