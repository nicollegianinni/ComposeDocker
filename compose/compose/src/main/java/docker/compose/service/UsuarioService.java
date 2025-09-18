package docker.compose.service;

import docker.compose.model.Usuario;
import docker.compose.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //add try catch para passar mensagem de usuario igual nao permite cadastrar 2 x
    public Usuario cadastrarUsuario(String name, double pr) {
        Usuario usuario = new Usuario(name, pr);
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> todosUsuarios() {
        return usuarioRepository.findAll();
    }
}
