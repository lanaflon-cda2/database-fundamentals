package massdefect.repositories;

import massdefect.domains.entities.SolarSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolarSystemRepository extends JpaRepository<SolarSystem, Long> {

    SolarSystem findByName(String name);
}
