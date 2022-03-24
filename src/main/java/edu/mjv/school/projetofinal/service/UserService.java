package edu.mjv.school.projetofinal.service;

import edu.mjv.school.projetofinal.exception.ObjNotFoundException;
import edu.mjv.school.projetofinal.model.Usuario;
import edu.mjv.school.projetofinal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UsuarioRepository usuarioRepository;


    @Autowired
    public UserService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario findById(int id) {
        Usuario usuario = usuarioRepository.findById(id);
        return usuario;
    }

    public void delete(int id) {
        usuarioRepository.delete(findById(id));
    }

    //Listando todos os usuários
    public List<Usuario> listAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findByEmail(String email){
        return usuarioRepository.findByEmail(email);
    }



    public Usuario save(Usuario usuario){
         return usuarioRepository.save(usuario);

    }
/*
    public Usuario alterar(Usuario usuario){

    }
*/



}
