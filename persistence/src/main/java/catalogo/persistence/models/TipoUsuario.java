package catalogo.persistence.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "tb_tipousuario", schema = "ctdsys_sch")
public class TipoUsuario {

    @Id
    @Column(name = "i_codtipousu")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tb_tipousuario_i_codtipousu_seq"
    )
    @SequenceGenerator(
            name = "tb_tipousuario_i_codtipousu_seq",
            sequenceName = "tb_tipousuario_i_codtipousu_seq",
            allocationSize = 1
    )
    private Integer id;

    @Column(name = "v_tipousu", nullable = false, length = 25)
    private String tipoUsuario;

    @Column(name = "s_permdb", nullable = false)
    private Short permisoDB;

    @Column(name = "s_permval", nullable = false)
    private Short permisoValidacion;

    @Column(name = "s_permreg", nullable = false)
    private Short permisoRegistro;

    @Column(name = "s_permcon", nullable = false)
    private Short permisoConsulta;

    @Column(name = "s_flagestado", nullable = false)
    private Short flagEstado;

    @Column(name = "v_usureg", length = 20)
    private String usuarioRegistro;

    @Column(name = "v_usumod", length = 20)
    private String usuarioModificacion;

    @Column(name = "t_fechreg")
    private Timestamp fechaRegistro;

    @Column(name = "t_fechmod")
    private Timestamp fechaModificacion;
}
