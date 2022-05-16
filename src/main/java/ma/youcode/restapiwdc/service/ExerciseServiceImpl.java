package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.exercice.ExerciseDto;
import ma.youcode.restapiwdc.repository.ExerciseRepository;
import ma.youcode.restapiwdc.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

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
        return exerciseRepository.save(exerciseDto);
    }

    @Override
    public Boolean delete(ExerciseDto exerciseDto) {
        try {
            exerciseRepository.delete(exerciseDto);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<ExerciseDto> findAll() {
        return exerciseRepository.findAll();
    }

    @Override
    public ExerciseDto findById(Long exerciseId) {
        return exerciseRepository.findById(exerciseId).get();
    }
}
