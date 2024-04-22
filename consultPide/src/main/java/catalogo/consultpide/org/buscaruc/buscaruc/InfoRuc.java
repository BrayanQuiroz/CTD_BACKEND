
package catalogo.consultpide.org.buscaruc.buscaruc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfoRuc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoRuc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cod_dep" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cod_dist" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cod_prov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_ciiu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_doble" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_fecact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_fecalt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_fecbaj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_flag22" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_identi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_inter1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_lllttt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_mclase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_nomvia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_nomzon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_numer1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_numreg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_numruc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_reacti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_refer1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_secuen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_tamano" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_tipvia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_tipzon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_tpoemp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ddp_userna" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_ciiu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_dep" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_dist" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_flag22" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_identi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_numreg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_prov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_tamano" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_tipvia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_tipzon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_tpoemp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="esActivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="esHabido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoRuc", propOrder = {
    "codDep",
    "codDist",
    "codProv",
    "ddpCiiu",
    "ddpDoble",
    "ddpEstado",
    "ddpFecact",
    "ddpFecalt",
    "ddpFecbaj",
    "ddpFlag22",
    "ddpIdenti",
    "ddpInter1",
    "ddpLllttt",
    "ddpMclase",
    "ddpNombre",
    "ddpNomvia",
    "ddpNomzon",
    "ddpNumer1",
    "ddpNumreg",
    "ddpNumruc",
    "ddpReacti",
    "ddpRefer1",
    "ddpSecuen",
    "ddpTamano",
    "ddpTipvia",
    "ddpTipzon",
    "ddpTpoemp",
    "ddpUbigeo",
    "ddpUserna",
    "descCiiu",
    "descDep",
    "descDist",
    "descEstado",
    "descFlag22",
    "descIdenti",
    "descNumreg",
    "descProv",
    "descTamano",
    "descTipvia",
    "descTipzon",
    "descTpoemp",
    "esActivo",
    "esHabido"
})
public class InfoRuc {

    @XmlElement(name = "cod_dep", required = true)
    protected String codDep;
    @XmlElement(name = "cod_dist", required = true)
    protected String codDist;
    @XmlElement(name = "cod_prov", required = true)
    protected String codProv;
    @XmlElement(name = "ddp_ciiu", required = true)
    protected String ddpCiiu;
    @XmlElement(name = "ddp_doble", required = true)
    protected String ddpDoble;
    @XmlElement(name = "ddp_estado", required = true)
    protected String ddpEstado;
    @XmlElement(name = "ddp_fecact", required = true)
    protected String ddpFecact;
    @XmlElement(name = "ddp_fecalt", required = true)
    protected String ddpFecalt;
    @XmlElement(name = "ddp_fecbaj", required = true)
    protected String ddpFecbaj;
    @XmlElement(name = "ddp_flag22", required = true)
    protected String ddpFlag22;
    @XmlElement(name = "ddp_identi", required = true)
    protected String ddpIdenti;
    @XmlElement(name = "ddp_inter1", required = true)
    protected String ddpInter1;
    @XmlElement(name = "ddp_lllttt", required = true)
    protected String ddpLllttt;
    @XmlElement(name = "ddp_mclase", required = true)
    protected String ddpMclase;
    @XmlElement(name = "ddp_nombre", required = true)
    protected String ddpNombre;
    @XmlElement(name = "ddp_nomvia", required = true)
    protected String ddpNomvia;
    @XmlElement(name = "ddp_nomzon", required = true)
    protected String ddpNomzon;
    @XmlElement(name = "ddp_numer1", required = true)
    protected String ddpNumer1;
    @XmlElement(name = "ddp_numreg", required = true)
    protected String ddpNumreg;
    @XmlElement(name = "ddp_numruc", required = true)
    protected String ddpNumruc;
    @XmlElement(name = "ddp_reacti", required = true)
    protected String ddpReacti;
    @XmlElement(name = "ddp_refer1", required = true)
    protected String ddpRefer1;
    @XmlElement(name = "ddp_secuen", required = true)
    protected String ddpSecuen;
    @XmlElement(name = "ddp_tamano", required = true)
    protected String ddpTamano;
    @XmlElement(name = "ddp_tipvia", required = true)
    protected String ddpTipvia;
    @XmlElement(name = "ddp_tipzon", required = true)
    protected String ddpTipzon;
    @XmlElement(name = "ddp_tpoemp", required = true)
    protected String ddpTpoemp;
    @XmlElement(name = "ddp_ubigeo", required = true)
    protected String ddpUbigeo;
    @XmlElement(name = "ddp_userna", required = true)
    protected String ddpUserna;
    @XmlElement(name = "desc_ciiu", required = true)
    protected String descCiiu;
    @XmlElement(name = "desc_dep", required = true)
    protected String descDep;
    @XmlElement(name = "desc_dist", required = true)
    protected String descDist;
    @XmlElement(name = "desc_estado", required = true)
    protected String descEstado;
    @XmlElement(name = "desc_flag22", required = true)
    protected String descFlag22;
    @XmlElement(name = "desc_identi", required = true)
    protected String descIdenti;
    @XmlElement(name = "desc_numreg", required = true)
    protected String descNumreg;
    @XmlElement(name = "desc_prov", required = true)
    protected String descProv;
    @XmlElement(name = "desc_tamano", required = true)
    protected String descTamano;
    @XmlElement(name = "desc_tipvia", required = true)
    protected String descTipvia;
    @XmlElement(name = "desc_tipzon", required = true)
    protected String descTipzon;
    @XmlElement(name = "desc_tpoemp", required = true)
    protected String descTpoemp;
    @XmlElement(required = true)
    protected String esActivo;
    @XmlElement(required = true)
    protected String esHabido;

    /**
     * Obtiene el valor de la propiedad codDep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDep() {
        return codDep;
    }

    /**
     * Define el valor de la propiedad codDep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDep(String value) {
        this.codDep = value;
    }

    /**
     * Obtiene el valor de la propiedad codDist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDist() {
        return codDist;
    }

    /**
     * Define el valor de la propiedad codDist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDist(String value) {
        this.codDist = value;
    }

    /**
     * Obtiene el valor de la propiedad codProv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProv() {
        return codProv;
    }

    /**
     * Define el valor de la propiedad codProv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProv(String value) {
        this.codProv = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpCiiu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpCiiu() {
        return ddpCiiu;
    }

    /**
     * Define el valor de la propiedad ddpCiiu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpCiiu(String value) {
        this.ddpCiiu = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpDoble.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpDoble() {
        return ddpDoble;
    }

    /**
     * Define el valor de la propiedad ddpDoble.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpDoble(String value) {
        this.ddpDoble = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpEstado() {
        return ddpEstado;
    }

    /**
     * Define el valor de la propiedad ddpEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpEstado(String value) {
        this.ddpEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpFecact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpFecact() {
        return ddpFecact;
    }

    /**
     * Define el valor de la propiedad ddpFecact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpFecact(String value) {
        this.ddpFecact = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpFecalt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpFecalt() {
        return ddpFecalt;
    }

    /**
     * Define el valor de la propiedad ddpFecalt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpFecalt(String value) {
        this.ddpFecalt = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpFecbaj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpFecbaj() {
        return ddpFecbaj;
    }

    /**
     * Define el valor de la propiedad ddpFecbaj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpFecbaj(String value) {
        this.ddpFecbaj = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpFlag22.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpFlag22() {
        return ddpFlag22;
    }

    /**
     * Define el valor de la propiedad ddpFlag22.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpFlag22(String value) {
        this.ddpFlag22 = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpIdenti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpIdenti() {
        return ddpIdenti;
    }

    /**
     * Define el valor de la propiedad ddpIdenti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpIdenti(String value) {
        this.ddpIdenti = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpInter1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpInter1() {
        return ddpInter1;
    }

    /**
     * Define el valor de la propiedad ddpInter1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpInter1(String value) {
        this.ddpInter1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpLllttt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpLllttt() {
        return ddpLllttt;
    }

    /**
     * Define el valor de la propiedad ddpLllttt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpLllttt(String value) {
        this.ddpLllttt = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpMclase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpMclase() {
        return ddpMclase;
    }

    /**
     * Define el valor de la propiedad ddpMclase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpMclase(String value) {
        this.ddpMclase = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpNombre() {
        return ddpNombre;
    }

    /**
     * Define el valor de la propiedad ddpNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpNombre(String value) {
        this.ddpNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpNomvia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpNomvia() {
        return ddpNomvia;
    }

    /**
     * Define el valor de la propiedad ddpNomvia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpNomvia(String value) {
        this.ddpNomvia = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpNomzon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpNomzon() {
        return ddpNomzon;
    }

    /**
     * Define el valor de la propiedad ddpNomzon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpNomzon(String value) {
        this.ddpNomzon = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpNumer1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpNumer1() {
        return ddpNumer1;
    }

    /**
     * Define el valor de la propiedad ddpNumer1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpNumer1(String value) {
        this.ddpNumer1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpNumreg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpNumreg() {
        return ddpNumreg;
    }

    /**
     * Define el valor de la propiedad ddpNumreg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpNumreg(String value) {
        this.ddpNumreg = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpNumruc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpNumruc() {
        return ddpNumruc;
    }

    /**
     * Define el valor de la propiedad ddpNumruc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpNumruc(String value) {
        this.ddpNumruc = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpReacti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpReacti() {
        return ddpReacti;
    }

    /**
     * Define el valor de la propiedad ddpReacti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpReacti(String value) {
        this.ddpReacti = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpRefer1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpRefer1() {
        return ddpRefer1;
    }

    /**
     * Define el valor de la propiedad ddpRefer1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpRefer1(String value) {
        this.ddpRefer1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpSecuen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpSecuen() {
        return ddpSecuen;
    }

    /**
     * Define el valor de la propiedad ddpSecuen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpSecuen(String value) {
        this.ddpSecuen = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpTamano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpTamano() {
        return ddpTamano;
    }

    /**
     * Define el valor de la propiedad ddpTamano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpTamano(String value) {
        this.ddpTamano = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpTipvia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpTipvia() {
        return ddpTipvia;
    }

    /**
     * Define el valor de la propiedad ddpTipvia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpTipvia(String value) {
        this.ddpTipvia = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpTipzon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpTipzon() {
        return ddpTipzon;
    }

    /**
     * Define el valor de la propiedad ddpTipzon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpTipzon(String value) {
        this.ddpTipzon = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpTpoemp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpTpoemp() {
        return ddpTpoemp;
    }

    /**
     * Define el valor de la propiedad ddpTpoemp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpTpoemp(String value) {
        this.ddpTpoemp = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpUbigeo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpUbigeo() {
        return ddpUbigeo;
    }

    /**
     * Define el valor de la propiedad ddpUbigeo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpUbigeo(String value) {
        this.ddpUbigeo = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpUserna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdpUserna() {
        return ddpUserna;
    }

    /**
     * Define el valor de la propiedad ddpUserna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdpUserna(String value) {
        this.ddpUserna = value;
    }

    /**
     * Obtiene el valor de la propiedad descCiiu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCiiu() {
        return descCiiu;
    }

    /**
     * Define el valor de la propiedad descCiiu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCiiu(String value) {
        this.descCiiu = value;
    }

    /**
     * Obtiene el valor de la propiedad descDep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDep() {
        return descDep;
    }

    /**
     * Define el valor de la propiedad descDep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDep(String value) {
        this.descDep = value;
    }

    /**
     * Obtiene el valor de la propiedad descDist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDist() {
        return descDist;
    }

    /**
     * Define el valor de la propiedad descDist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDist(String value) {
        this.descDist = value;
    }

    /**
     * Obtiene el valor de la propiedad descEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEstado() {
        return descEstado;
    }

    /**
     * Define el valor de la propiedad descEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEstado(String value) {
        this.descEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descFlag22.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescFlag22() {
        return descFlag22;
    }

    /**
     * Define el valor de la propiedad descFlag22.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescFlag22(String value) {
        this.descFlag22 = value;
    }

    /**
     * Obtiene el valor de la propiedad descIdenti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescIdenti() {
        return descIdenti;
    }

    /**
     * Define el valor de la propiedad descIdenti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescIdenti(String value) {
        this.descIdenti = value;
    }

    /**
     * Obtiene el valor de la propiedad descNumreg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescNumreg() {
        return descNumreg;
    }

    /**
     * Define el valor de la propiedad descNumreg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescNumreg(String value) {
        this.descNumreg = value;
    }

    /**
     * Obtiene el valor de la propiedad descProv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProv() {
        return descProv;
    }

    /**
     * Define el valor de la propiedad descProv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProv(String value) {
        this.descProv = value;
    }

    /**
     * Obtiene el valor de la propiedad descTamano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTamano() {
        return descTamano;
    }

    /**
     * Define el valor de la propiedad descTamano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTamano(String value) {
        this.descTamano = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipvia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipvia() {
        return descTipvia;
    }

    /**
     * Define el valor de la propiedad descTipvia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipvia(String value) {
        this.descTipvia = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipzon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipzon() {
        return descTipzon;
    }

    /**
     * Define el valor de la propiedad descTipzon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipzon(String value) {
        this.descTipzon = value;
    }

    /**
     * Obtiene el valor de la propiedad descTpoemp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTpoemp() {
        return descTpoemp;
    }

    /**
     * Define el valor de la propiedad descTpoemp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTpoemp(String value) {
        this.descTpoemp = value;
    }

    /**
     * Obtiene el valor de la propiedad esActivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsActivo() {
        return esActivo;
    }

    /**
     * Define el valor de la propiedad esActivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsActivo(String value) {
        this.esActivo = value;
    }

    /**
     * Obtiene el valor de la propiedad esHabido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsHabido() {
        return esHabido;
    }

    /**
     * Define el valor de la propiedad esHabido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsHabido(String value) {
        this.esHabido = value;
    }

}
