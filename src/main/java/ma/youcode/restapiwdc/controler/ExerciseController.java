package ma.youcode.restapiwdc.controler;

import ma.youcode.restapiwdc.entity.Exercise;
import ma.youcode.restapiwdc.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/")
    public List<Exercise> getAll(){
        return exerciseService.findAll();
    }

    @GetMapping("/find/{id}")
    public Exercise find(@PathVariable("id") Long id){
        return exerciseService.findById(id);
    }

    @PutMapping("/update/{id}")
    public Exercise update(@RequestBody Exercise exercise,@PathVariable("id") Long id){
        exercise.setIdExercise(id);
        return exerciseService.update(exercise);
    }

    @PostMapping("/add")
    public Exercise store(@RequestBody Exercise exercise){
        return exerciseService.add(exercise);
    }

    @DeleteMapping("/delete")
    public Boolean delete(Exercise exercise){
        return exerciseService.delete(exercise);
    }
}
