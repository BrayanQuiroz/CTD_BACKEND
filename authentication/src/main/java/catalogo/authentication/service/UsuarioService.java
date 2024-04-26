package catalogo.authentication.service;

import catalogo.authentication.client.UserClient;
import catalogo.authentication.dto.UsuarioDTO;
import catalogo.authentication.exception.InternalServerErrorException;
import catalogo.authentication.exception.UserNotFoundException;
import catalogo.authentication.exception.UserServiceException;
import feign.FeignException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UserClient usuarioClient;
    private final UserClient userClient;

    public UsuarioService(UserClient usuarioClient, UserClient userClient) {
        this.usuarioClient = usuarioClient;
        this.userClient = userClient;
    }

    public UsuarioDTO getUsuario(Long ruc) {
        try {
            return userClient.findByUsername(ruc);
        }catch (FeignException.FeignClientException ex){

            switch (ex.status()) {
                case 404:
                    throw new UserNotFoundException("No se encontro el: " + ruc);
                case 500:
                    throw new InternalServerErrorException("Internal server error occurred in user service");
                default:
                    throw new UserServiceException("Error fetching user details", ex);
            }
        }
    }
}
