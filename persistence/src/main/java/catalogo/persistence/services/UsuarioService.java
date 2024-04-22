package catalogo.persistence.services;

import catalogo.persistence.models.Usuario;
import catalogo.persistence.repositories.UsuarioRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {


    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario getUsuarioByRuc(Long ruc) {
        return usuarioRepository.findByRuc(ruc);
    }
}
