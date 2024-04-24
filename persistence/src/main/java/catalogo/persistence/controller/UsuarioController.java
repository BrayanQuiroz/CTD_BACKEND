package catalogo.persistence.controller;

import catalogo.persistence.models.PersonaJuridica;
import catalogo.persistence.models.Usuario;
import catalogo.persistence.services.PersonaJuridicaService;
import catalogo.persistence.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PersonaJuridicaService personaJuridicaService;

//    @GetMapping("/all")
//    public ResponseEntity<List<Map<String, Object>>> getAllUsuarios() {
//        List<Usuario> usuarios = usuarioService.getUsuarioAll();
//        if (usuarios.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        List<Map<String, Object>> usuariosData = usuarios.stream().map(usuario -> {
//            Map<String, Object> usuarioMap = new HashMap<>();
//            usuarioMap.put("ruc", usuario.getRuc());
//            usuarioMap.put("flagEstado", usuario.getFlagEstado());
//            if (usuario.getTipoUsuario() != null) {
//                usuarioMap.put("tipoUsuario", Collections.singletonMap("descripcion", usuario.getTipoUsuario().getDesTipoUsu()));
//            } else {
//                usuarioMap.put("tipoUsuario", "No especificado");
//            }
//            return usuarioMap;
//        }).toList();
//
//        return ResponseEntity.ok(usuariosData);
//    }
    @GetMapping("/{ruc}")
    public ResponseEntity<?> getUsuarioByRuc(@PathVariable Long ruc) {
        Usuario usuario = usuarioService.getUsuarioByRuc(ruc);

        if (usuario == null || usuario.getFlagEstado() != 1) {

            Map<String, String> error = new HashMap<>();
            error.put("error", "No se encontró el usuario o el usuario no está activo");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
        }

        PersonaJuridica personaJuridica = personaJuridicaService.getPersonaJuridicaByCodUsuario(usuario.getCodUsuario());

        if (personaJuridica == null) {
            Map<String, String> error = new HashMap<>();
            error.put("error", "No se encontró la persona jurídica asociada al usuario");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
        }

        Map<String, Object> response = new HashMap<>();
        response.put("codusuario", usuario.getCodUsuario());
        response.put("ruc", usuario.getRuc());
        response.put("password", usuario.getPassword());
        response.put("estado", usuario.getFlagEstado());
        response.put("flagEstado", usuario.getFlagEstado());
        response.put("tipoUsuario", usuario.getTipoUsuario().getDesTipoUsu());
        response.put("razonSocial", personaJuridica.getRazonSocial());

        return ResponseEntity.ok(response);

    }
}


