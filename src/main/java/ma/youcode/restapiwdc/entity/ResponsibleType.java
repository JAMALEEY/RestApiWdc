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
public class ResponsibleType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTypeResponsible")
    private Long id;

    @Column(name = "responsibleType")
    private String responsibleType;

}