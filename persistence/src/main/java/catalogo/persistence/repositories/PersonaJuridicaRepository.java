package catalogo.persistence.repositories;

import catalogo.persistence.models.PersonaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaJuridicaRepository extends JpaRepository<PersonaJuridica, Long> {
    PersonaJuridica findPersonaJuridicasByRuc(Long ruc);
}
