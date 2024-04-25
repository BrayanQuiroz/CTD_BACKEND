package catalogo.persistence.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "tb_subsector", schema = "ctdsys_sch")
public class SubSector {

    @Id
    @Column(name = "i_codsubsector")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tb_subsector_i_codsubsector_seq"
    )
    @SequenceGenerator(
            name = "tb_subsector_i_codsubsector_seq",
            sequenceName = "tb_subsector_i_codsubsector_seq",
            allocationSize = 1
    )
    private Integer codSubSector;

    @Column(name = "v_dessubsector", nullable = false, length = 50)
    private String descripcion;

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
