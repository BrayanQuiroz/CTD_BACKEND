package catalogo.persistence.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_eslabon", schema = "ctdsys_sch")
public class Eslabon {

    @Id
    @Column(name = "i_codeslabon")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tb_eslabon_i_codeslabon_seq"
    )
    @SequenceGenerator(
            name = "tb_eslabon_i_codeslabon_seq",
            sequenceName = "tb_eslabon_i_codeslabon_seq",
            allocationSize = 1
    )
    private Integer id;

    @Column(name = "v_deseslabon", nullable = false, length = 50)
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
