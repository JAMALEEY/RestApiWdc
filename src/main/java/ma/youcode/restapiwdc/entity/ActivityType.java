package ma.youcode.restapiwdc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Entity
@PrimaryKeyJoinColumn(name = "activitytypeId")
@Table(name = "activitytypes")

public class ActivityType extends Activity implements Serializable {

    @Column(name = "activityType")
    private String activityType;

}