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
@Table(name = "activities")
public class Activity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActivity;

    @NotNull(message = "please choose activity name")
    @Column(name = "activity name")
    private String activityName;

    @NotNull(message = "please choose activity description")
    @Column(name = "activity description")
    private String activityDescription;

    @NotNull(message = "please choose activity type")
    @Column(name = "activity Type")
    private String activityType;

    @NotNull(message = "please choose starting date")
    @Column(name = "activity starting date")
    private Date activityStart;

    @NotNull(message = "please choose ending date")
    @Column(name = "activity ending date")
    private Date activityEnd;

    @Enumerated(EnumType.STRING)
    private ActivityStatus activityStatus;

}