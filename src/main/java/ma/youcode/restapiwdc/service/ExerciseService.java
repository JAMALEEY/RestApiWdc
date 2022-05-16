package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.exercice.ExerciseDto;


import java.util.List;

public interface ExerciseService {
    ExerciseDto add(ExerciseDto exerciseDto);
    ExerciseDto update(ExerciseDto exerciseDto);
    Boolean delete(ExerciseDto exerciseDto);
    List<ExerciseDto> findAll();
    ExerciseDto findById(Long exerciseId);
}
