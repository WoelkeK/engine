package pl.woelke.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.woelke.spring.app.repository.entity.EngineAssyEntity;

@Repository
public interface EngineAssyRepository extends JpaRepository<EngineAssyEntity, Long> {
 }
