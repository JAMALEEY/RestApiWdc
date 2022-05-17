package ma.youcode.restapiwdc.service;


import ma.youcode.restapiwdc.entity.Exercise;
import ma.youcode.restapiwdc.repository.ExerciseRepository;
import ma.youcode.restapiwdc.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class ExerciseServiceImpl implements ExerciseService{
    @Autowired
    private ExerciseRepository exerciseRepository;


    @Override
    public Exercise add(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public Exercise update(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public Boolean delete(Exercise exercise) {
        try {
            exerciseRepository.delete(exercise);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Exercise> findAll() {
        return exerciseRepository.findAll();
    }

    @Override
    public Exercise findById(Long exerciseId) {
        return exerciseRepository.findById(exerciseId).get();
    }
}
