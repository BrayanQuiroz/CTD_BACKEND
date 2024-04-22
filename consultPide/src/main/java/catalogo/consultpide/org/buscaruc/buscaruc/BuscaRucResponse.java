
package catalogo.consultpide.org.buscaruc.buscaruc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RucEncontrados" type="{http://www.BuscaRuc.org/BuscaRuc/}ArrayOfInfoRuc"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rucEncontrados"
})
@XmlRootElement(name = "BuscaRucResponse")
public class BuscaRucResponse {

    @XmlElement(name = "RucEncontrados", required = true, nillable = true)
    protected ArrayOfInfoRuc rucEncontrados;

    /**
     * Obtiene el valor de la propiedad rucEncontrados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoRuc }
     *     
     */
    public ArrayOfInfoRuc getRucEncontrados() {
        return rucEncontrados;
    }

    /**
     * Define el valor de la propiedad rucEncontrados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoRuc }
     *     
     */
    public void setRucEncontrados(ArrayOfInfoRuc value) {
        this.rucEncontrados = value;
    }

}
