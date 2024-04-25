package catalogo.persistence.services;

import catalogo.persistence.models.SubSector;
import catalogo.persistence.repositories.SubSectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubSectorService {

    private final SubSectorRepository subSectorRepository;

    @Autowired
    public SubSectorService(SubSectorRepository subSectorRepository, SubSectorRepository subSectorRepository1){
        this.subSectorRepository = subSectorRepository1;
    }

    public SubSector getSubSectorByCodSubSector(Integer codSubSector){
        return subSectorRepository.findSubSectorByCodSubSector(codSubSector);
    }
}
