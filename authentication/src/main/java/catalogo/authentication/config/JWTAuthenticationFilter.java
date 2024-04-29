package catalogo.authentication.config;

import catalogo.authentication.dto.UsuarioDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HexFormat;

@EqualsAndHashCode(callSuper = true)
@Data
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    private static final String HEADER_STRING = "Authorization";
    private static final String TOKEN_PREFIX = "Bearer ";



    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletRequest response)
            throws AuthenticationException {

        try{
            UsuarioDTO creds = new ObjectMapper().readValue(request.getInputStream(),UsuarioDTO.class);
            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                    creds.getRuc(),
                    creds.getPassword(),
                    new ArrayList<>()
                    )
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication auth)
            throws IOException{



        UsuarioDTO usuario = (UsuarioDTO) auth.getPrincipal();

        byte[] apiKeySecretBytes = HexFormat.of().parseHex("eee41978fad54f1ed1d5e641721f7055dcf153eea3781a4bc8eba02b8ce88a7c");
        SecretKey key = new SecretKeySpec(apiKeySecretBytes, "HmacSHA512");

        Claims claims = (Claims) Jwts.claims();
        claims.put("ruc", usuario.getRuc());
        claims.put("razonSocial", usuario.getRazonSocial());

        String token = Jwts.builder()
                .setSubject(String.valueOf(((UsuarioDTO) auth.getPrincipal()).getRuc()))
                .setClaims(claims)
                .signWith(key, SignatureAlgorithm.HS512)
                .compact();
        response.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
    }
}























