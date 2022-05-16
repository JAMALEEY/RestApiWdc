package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.exercice.ExerciseDto;
import ma.youcode.restapiwdc.repository.ExerciseRepository;
import ma.youcode.restapiwdc.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExerciseServiceImpl implements ExerciseService{
    @Autowired
    private ExerciseRepository exerciseRepository;


    @Override
    public ExerciseDto add(ExerciseDto exerciseDto) {
        return exerciseRepository.save(exerciseDto);
    }

    @Override
    public ExerciseDto update(ExerciseDto exerciseDto) {
        return null;
    }

    @Override
    public Boolean delete(ExerciseDto exerciseDto) {
        return null;
    }

    @Override
    public List<ExerciseDto> findAll() {
        return null;
    }

    @Override
    public ExerciseDto findById(Long exerciseDto) {
        return null;
    }
}
