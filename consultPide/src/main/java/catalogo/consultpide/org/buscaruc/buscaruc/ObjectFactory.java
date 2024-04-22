
package catalogo.consultpide.org.buscaruc.buscaruc;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.buscaruc.buscaruc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscaRucRequest_QNAME = new QName("http://www.BuscaRuc.org/BuscaRuc/", "BuscaRucRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.buscaruc.buscaruc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscaRucResponse }
     * 
     */
    public BuscaRucResponse createBuscaRucResponse() {
        return new BuscaRucResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInfoRuc }
     * 
     */
    public ArrayOfInfoRuc createArrayOfInfoRuc() {
        return new ArrayOfInfoRuc();
    }

    /**
     * Create an instance of {@link InfoRuc }
     * 
     */
    public InfoRuc createInfoRuc() {
        return new InfoRuc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.BuscaRuc.org/BuscaRuc/", name = "BuscaRucRequest")
    public JAXBElement<String> createBuscaRucRequest(String value) {
        return new JAXBElement<String>(_BuscaRucRequest_QNAME, String.class, null, value);
    }

}
