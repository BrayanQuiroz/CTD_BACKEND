package catalogo.authentication.controller;

import catalogo.authentication.dto.UsuarioDTO;
import catalogo.authentication.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final UsuarioService usuarioService;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public AuthController(UsuarioService usuarioService, BCryptPasswordEncoder passwordEncoder) {
        this.usuarioService = usuarioService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsuarioDTO credentials){

        UsuarioDTO usuario = usuarioService.getUsuario(credentials.getRuc());

        if (usuario != null && passwordEncoder.matches(credentials.getPassword(), usuario.getPassword())) {
            return ResponseEntity.ok("Usuario autenticado correctamente");
        }

        return ResponseEntity.ok("Datos ingresados son incorrectos");
    }
}
