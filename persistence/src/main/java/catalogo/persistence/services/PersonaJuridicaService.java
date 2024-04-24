package catalogo.persistence.services;

import catalogo.persistence.models.PersonaJuridica;
import catalogo.persistence.repositories.PersonaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaJuridicaService {


    private final PersonaJuridicaRepository personaJuridicaRepository;

    @Autowired
    public PersonaJuridicaService(PersonaJuridicaRepository personaJuridicaRepository) {
        this.personaJuridicaRepository = personaJuridicaRepository;
    }

    public PersonaJuridica getPersonaJuridicaByCodUsuario(Integer codUsuario) {
        return personaJuridicaRepository.findByUsuarioCodUsuario(codUsuario);
    }

}
