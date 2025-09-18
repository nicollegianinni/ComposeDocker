package docker.compose.repository;

import docker.compose.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface UsuarioRepository extends JpaRepository <Usuario, String> {

}
