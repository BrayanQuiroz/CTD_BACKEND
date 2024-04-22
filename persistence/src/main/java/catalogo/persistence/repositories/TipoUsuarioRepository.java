package catalogo.persistence.repositories;

import catalogo.persistence.models.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {
        TipoUsuario findTipoUsuarioById(Integer id);
}
