package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.dto.model.exercice.ActivityDto;
import ma.youcode.restapiwdc.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityDto, Long> {
}
