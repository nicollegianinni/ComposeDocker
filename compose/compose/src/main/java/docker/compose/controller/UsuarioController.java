package docker.compose.controller;

import docker.compose.model.Usuario;
import docker.compose.repository.UsuarioRepository;
import docker.compose.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/home")
    public String homeBoasVindas() {
        return "[frontend] Boas vindas ao site de PR! \n [Cadastre aqui seu PR] \n [Lista de Usuarios]";
    }
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAll() {
        return ResponseEntity.ok(usuarioService.todosUsuarios());
    }

    @PostMapping("/cadastrar")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario.getName(), usuario.getPR());
    }
}
