package catalogo.persistence.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "mv_personajuridica" , schema = "ctdsys_sch")
public class PersonaJuridica {

    @Id
    @Column(name = "b_ruc")
    private Long ruc;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "i_codusuario")
    private Usuario usuario;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "i_codcadprod")
    private CadenaProductiva cadenaProductiva;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "i_codserv")
    private Servicio servicio;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "i_codsector")
    private Sector sector;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "i_codsubsector")
    private Sector subSector;

    @Column(name = "v_razonsocial", nullable = false, length = 80)
    private String razonSocial;


    @Column(name = "i_activo", nullable = false)
    private Integer activo;

    @Column(name = "i_habido", nullable = false)
    private Integer habido;

    @Column(name = "v_direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "v_departamento", nullable = false, length = 25)
    private String departamentos;

    @Column(name = "v_provincia", nullable = false, length = 25)
    private String provincia;

    @Column(name = "v_distrito", nullable = false, length = 25)
    private String distrito;

    @Column(name = "v_nombres", nullable = false, length = 22)
    private String nombres;

    @Column(name = "v_genero", nullable = false, length = 6)
    private String genero;

    @Column(name = "v_apellidopater", nullable = false, length = 18)
    private String apellidoPaterno;

    @Column(name = "v_apellidomater", nullable = false, length = 18)
    private String apellidoMaterno;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "i_coddep")
    private Departamento departamento;

    @Column(name = "d_fechnacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "v_tipoprov", nullable = false, length = 23)
    private String tipoProveedor;

    @Column(name = "v_nivelacadem", nullable = false, length = 15)
    private String nivelAcademico;

    @Column(name = "v_carreraprofe", nullable = false, length = 50)
    private String carreraProfesional;

    @Column(name = "s_explaboral", nullable = false)
    private Short experienciaLaboral;

    @Column(name = "v_certilab", nullable = false, length = 50)
    private String certificadoLaboral;

    @Column(name = "v_curriculum", nullable = false, length = 50)
    private String curriculum;

    @Column(name = "v_website", length = 100)
    private String website;

    @Column(name = "s_flagestado", nullable = false)
    private Short flagEstado;

    @Column(name = "v_usureg", length = 20)
    private String usureg;

    @Column(name = "v_usumod", length = 20)
    private String usumod;

    @Column(name = "t_fechreg")
    private Timestamp fechreg;

    @Column(name = "t_fechmod")
    private Timestamp fechmod;
}
