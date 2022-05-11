package ma.youcode.restapiwdc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
@ToString

@Entity
@Table(name = "roles")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    @NotNull(message = "please choose role name")
    @Column(name = "role name")
    private String roleName;

    @NotNull(message = "please choose role name")
    @ElementCollection
    @Column(name = "role name")
//    @CollectionTable(name="listOfUsers")
    private  ArrayList <String> access = new ArrayList<String>();
}
