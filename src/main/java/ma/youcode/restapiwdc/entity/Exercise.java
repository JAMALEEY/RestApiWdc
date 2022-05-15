package ma.youcode.restapiwdc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString

@Entity
@Table(name = "exercices")
public class Exercise implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExercise;

    @NotNull(message = "please choose title name")
    @Column(name = "exercise name")
    private String exerciseName;

    @NotNull(message = "please choose exercise year")
    @Column(name = "exercise year")
    private Long exerciseYear;

    @NotNull(message = "please choose starting date")
    @Column(name = "exercise starting date")
    private Date exerciseStart;

    @NotNull(message = "please choose ending date")
    @Column(name = "exercise ending date")
    private Date exerciseEnd;

    @Enumerated(EnumType.STRING)
    private ExerciseStatus state;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idActivity")
    private Activity idActivity;




}
