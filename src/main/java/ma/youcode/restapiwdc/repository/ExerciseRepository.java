package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.dto.model.exercice.ExerciseDto;
import ma.youcode.restapiwdc.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<ExerciseDto, Long> {
}
