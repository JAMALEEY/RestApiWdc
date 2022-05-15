package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.entity.ActivityStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityStatusRepository extends JpaRepository<ActivityStatus, String> {
}
