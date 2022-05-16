package ma.youcode.restapiwdc.service;


import ma.youcode.restapiwdc.entity.Exercise;


import java.util.List;

public interface ExerciseService {
    Exercise add(Exercise exercise);
    Exercise update(Exercise exercise);
    Boolean delete(Exercise exercise);
    List<Exercise> findAll();
    Exercise findById(Long exerciseId);
}
