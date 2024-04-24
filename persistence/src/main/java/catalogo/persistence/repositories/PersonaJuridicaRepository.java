package catalogo.persistence.repositories;

import catalogo.persistence.models.PersonaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PersonaJuridicaRepository extends JpaRepository<PersonaJuridica, Long> {
    PersonaJuridica findByUsuarioCodUsuario(Integer codUsuario);
}
