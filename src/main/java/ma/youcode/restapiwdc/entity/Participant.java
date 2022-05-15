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
@PrimaryKeyJoinColumn(name = "idParticipant")
@Table(name = "participants")
public class Participant extends User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParticipant;

    @Column(name = "domaine")
    private String domaine;

    @Column(name = "structure")
    private String structure;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

}