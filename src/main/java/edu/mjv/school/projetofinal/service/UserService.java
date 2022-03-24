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

    //Busca por id retornando uma exception utilizando o ElseThrow da classe optional
    public Usuario findById(int id) {
        Optional<Usuario> obj = usuarioRepository.findById(id);
        return obj.orElseThrow(() -> new ObjNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
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
