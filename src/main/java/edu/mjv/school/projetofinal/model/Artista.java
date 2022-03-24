package edu.mjv.school.projetofinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="artista")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 80)
    private String nome;
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "artista")
    private List<Musica> musicas = new ArrayList<>();




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

    public List getMusicas() {
        return musicas;
    }

    public void setMusicas(List musicas) {
        this.musicas = musicas;
    }




}
