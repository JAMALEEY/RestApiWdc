package ma.youcode.restapiwdc.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString

//@Entity is a JPA annotation to make this object ready for storage in a JPA-based data store.
@Entity
@Table(name = "users")
// on order to enable the deserialization of the fields in the process of persistence crossplatform
public class User implements Serializable {
    // The member field below is the primary key of current entity
    @Id
    // Specify how the primary key should be generated
    // In my case I want my primary keys to be assigned to the entity using a database identity column.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    La valeur du serialVersionUID de cet exemple a été générée
//    private  static  final  long serialVersionUID =  1350092881346723535L;
    private Long idUser;

    @NotNull(message = "firstName")
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @NotNull(message = "lastName")
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @NotNull(message = "login")
    @Column(name = "login", nullable = false)
    private String login;

    @NotNull(message = "password")
    @Column(name = "password", nullable = false)
    private String password;

    @NotNull(message = "phoneNumber")
    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @NotNull(message = "email")
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull(message = "status")
    @Column(name = "status", nullable = false)
    private Boolean status;

    @NotNull(message = "role")
    @Column(name = "role", nullable = false)
    @ManyToOne
    private Role roles;

}
