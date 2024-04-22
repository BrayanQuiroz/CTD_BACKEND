
package catalogo.consultpide.org.buscaruc.buscaruc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfoRuc", propOrder = {
    "item"
})
public class ArrayOfInfoRuc {

    protected List<InfoRuc> item;


    public List<InfoRuc> getItem() {
        if (item == null) {
            item = new ArrayList<InfoRuc>();
        }
        return this.item;
    }

}
