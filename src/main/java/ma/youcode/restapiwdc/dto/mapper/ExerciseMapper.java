package ma.youcode.restapiwdc.dto.mapper;

import ma.youcode.restapiwdc.dto.model.ExerciseDto;
import ma.youcode.restapiwdc.entity.Exercise;
import org.springframework.stereotype.Component;

@Component
public class ExerciseMapper {
    public static ExerciseDto exerciseDto(Exercise exercise){
        return new ExerciseDto()
                .setIdExercise(exercise.getIdExercise())
                .setExerciseName(exercise.getExerciseName())
                .setExerciseYear(exercise.getExerciseYear())
                .setExerciseStart(exercise.getExerciseStart())
                .setExerciseEnd(exercise.getExerciseEnd())
                .setState(exercise.getState());
    }
}
