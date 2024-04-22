package catalogo.persistence.controller;

import catalogo.persistence.models.Usuario;
import catalogo.persistence.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{ruc}")
    public ResponseEntity<?> getUsuarioByRuc(@PathVariable Long ruc) {
        Usuario usuario = usuarioService.getUsuarioByRuc(ruc);
        if (usuario == null) {
            return ResponseEntity.notFound().build();  // Return 404 if user is not found
        }
        return ResponseEntity.ok(Map.of(
                "ruc", usuario.getRuc(),
//                "password", usuario.getPassword(),  // Consider not exposing this unless absolutely necessary
                "flagEstado", usuario.getFlagEstado(),
                "tipoUsuario", Map.of(
                        "tipo", usuario.getTipoUsuario().getTipoUsuario(),
                        "permisoDB", usuario.getTipoUsuario().getPermisoDB(),
                        "permisoValidacion", usuario.getTipoUsuario().getPermisoValidacion(),
                        "permisoRegistro", usuario.getTipoUsuario().getPermisoRegistro(),
                        "permisoConsulta", usuario.getTipoUsuario().getPermisoConsulta()
                )
        ));
    }
}
