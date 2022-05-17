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
@PrimaryKeyJoinColumn(name = "idResponsible")
@Table(name = "responsibles")
public class Responsible extends User implements Serializable {

    @Column(name = "resposibleDomain")
    private String resposibleDomain;

}
