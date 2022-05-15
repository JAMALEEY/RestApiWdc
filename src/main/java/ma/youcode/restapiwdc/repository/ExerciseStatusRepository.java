package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.entity.ExerciseStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseStatusRepository extends JpaRepository<ExerciseStatus, String> {
}
