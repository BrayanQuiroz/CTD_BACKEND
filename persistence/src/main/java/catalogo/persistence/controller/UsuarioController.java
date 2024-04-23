package catalogo.persistence.controller;

import catalogo.persistence.models.Usuario;
import catalogo.persistence.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

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
    if (usuario == null) {
        return ResponseEntity.notFound().build();  // Return 404 if user is not found
    }
    return ResponseEntity.ok(Map.of(
            "ruc", usuario.getRuc(),
//                "password", usuario.getPassword(),  // Consider not exposing this unless absolutely necessary
            "flagEstado", usuario.getFlagEstado(),
            "tipoUsuario", Map.of(
                    "descripcion", usuario.getTipoUsuario().getDesTipoUsu()
                    )
    ));
    }
}


