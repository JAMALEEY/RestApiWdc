package ma.youcode.restapiwdc.dto.model.exercise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import ma.youcode.restapiwdc.entity.ExerciseStatus;

import java.util.Date;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class ExerciseDto {
    private Long idExercise;
    private String exerciseName;
    private Long exerciseYear;
    private Date exerciseStart;
    private Date exerciseEnd;
    private ExerciseStatus state;



}
