package catalogo.persistence.repositories;

import catalogo.persistence.models.SubSector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubSectorRepository  extends JpaRepository<SubSector, Integer> {
        SubSector findSubSectorByCodSubSector(Integer codSubSector);
}
