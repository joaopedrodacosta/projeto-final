package edu.mjv.school.projetofinal.model;



public enum Genero {


        PAGODE("Pagode"), RAP("Rap"), INDIE("Indie"), ELETRONICA("Eletronica"),
    HIP_HOP("HipHop"), MPB("MPB"), REGGIE("Reggie"), POP("Pop");

        // atributos do enum
        private String nome;

        private Genero(String nome) {
            this.nome = nome;

        }

        public String getNome() {
            return nome;
        }


    }

