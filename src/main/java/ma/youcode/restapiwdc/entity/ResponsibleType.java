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
@Table(name = "responsibletypes")
@PrimaryKeyJoinColumn(name = "user_id")

public class ResponsibleType extends User implements Serializable {

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "responsible_type_id")
    private ResponsibleType type;


    @Column(name = "responsibleType")
    private String responsibleType;

}