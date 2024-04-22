package catalogo.persistence.repositories;

import catalogo.persistence.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByRuc(Long ruc);
}
