package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, String> {
}
