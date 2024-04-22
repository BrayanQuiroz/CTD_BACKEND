package catalogo.authentication.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "persistence", url = "http://localhost:8000")
public class UsuarioClient {
//
//    @GetMapping("/usuarios/search/findByRuc")
//    Us
}
