package catalogo.persistence.controller;

import catalogo.persistence.models.*;
import catalogo.persistence.repositories.CadenaProductivaRepository;
import catalogo.persistence.repositories.SectorRepository;
import catalogo.persistence.services.*;
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
    @Autowired
    private CadenaProductivaService cadenaProductivaService;

    @Autowired
    private SectorService sectorService;
    @Autowired
    private SubSectorService subSectorService;
    @Autowired
    private DepartamentoService departamentoService;

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
        CadenaProductiva cadenaProductiva = cadenaProductivaService.getCadenaProductivaByCodCadProd(personaJuridica.getCadenaProductiva().getCodcadprod());
        Sector sector = sectorService.getSectorByCodSector(personaJuridica.getServicio().getId());
        SubSector subSector = subSectorService.getSubSectorByCodSubSector(personaJuridica.getSubSector().getCodSector());
        Departamento departamento = departamentoService.getDepartamentoById(personaJuridica.getDepartamento().getCodDep());

        Map<String, Object> response = new HashMap<>();
        response.put("codusuario", usuario.getCodUsuario());
        response.put("ruc", usuario.getRuc());
        response.put("password", usuario.getPassword());
        response.put("estado", usuario.getFlagEstado());
        response.put("flagEstado", usuario.getFlagEstado());
        response.put("tipoUsuario", usuario.getTipoUsuario().getDesTipoUsu());
        response.put("razonSocial", personaJuridica.getRazonSocial());
        response.put("nombres", personaJuridica.getNombres());
        response.put("apellidoPaterno", personaJuridica.getApellidoPaterno());
        response.put("apellidoMaterno", personaJuridica.getApellidoMaterno());
        response.put("genero", personaJuridica.getGenero());
        response.put("fechaNacimiento", personaJuridica.getFechaNacimiento());
        response.put("tipoProveedor", personaJuridica.getTipoProveedor());
        response.put("nivelAcademico", personaJuridica.getNivelAcademico());
        response.put("carreraProfesional", personaJuridica.getCarreraProfesional());
        response.put("experienciaLaboral", personaJuridica.getExperienciaLaboral());
        response.put("certificadoLaboral", personaJuridica.getCertificadoLaboral());
        response.put("curriculum", personaJuridica.getCurriculum());
        response.put("update", personaJuridica.getFlagUpdate());
        response.put("cadenaProductiva", cadenaProductiva.getDescadprod());
        response.put("sector", sector.getDescripcion());
        response.put("subSector", subSector.getDescripcion());
        response.put("direccion", personaJuridica.getDireccion());
        response.put("departamento", personaJuridica.getDepartamentos());
        response.put("provincia", personaJuridica.getProvincia());
        response.put("distrito", personaJuridica.getDistrito());
        response.put("departamentos", personaJuridica.getDistrito());
        response.put("departamentos", departamento.getDescripcion());
        response.put("provincia", personaJuridica.getProvincia());

        return ResponseEntity.ok(response);

    }
}


